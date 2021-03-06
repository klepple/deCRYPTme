/*
 * Kahlia Lepple (c) 2017
 */
package org.me.ciphers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ELYEB
 */
public class CaesarCipherTest {
    
    public CaesarCipherTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of encrypt method, of class CaesarCipher.
     */
    @Test
    public void testEncrypt() {
        System.out.println("encrypt");
        String plaintext = "The quick brown fox jumps over the lazy dog";
        CaesarCipher instance = new CaesarCipher(5);
        String expResult = "ymj vznhp gwtbs ktc ozrux tajw ymj qfed itl";
        String result = instance.encrypt(plaintext);
        assertEquals(expResult, result);
    }

    /**
     * Test of decrypt method, of class CaesarCipher.
     */
    @Test
    public void testDecrypt() {
        System.out.println("decrypt");
        String ciphertext = "ftq cguow ndaiz raj vgybe ahqd ftq xmlk pas";
        CaesarCipher instance = new CaesarCipher(12);
        String expResult = "the quick brown fox jumps over the lazy dog";
        String result = instance.decrypt(ciphertext);
        assertEquals(expResult, result);
    }
    
}
