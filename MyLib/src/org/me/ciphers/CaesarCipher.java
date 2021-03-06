/*
 * Kahlia Lepple (c) 2017
 * 
 */
package org.me.ciphers;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ELYEB
 */

public class CaesarCipher {
  private final int key;
  private final List<Character> plainAlphabet = Arrays.asList('a', 'b', 'c', 'd', 'e',
                                  'f', 'g', 'h', 'i', 'j',
                                  'k', 'l', 'm', 'n', 'o',
                                  'p', 'q', 'r', 's', 't',
                                  'u', 'v', 'w', 'x', 'y', 'z');

  public CaesarCipher(int key){
      if(key < 1 || key > 25)
          throw new IllegalArgumentException("The cipher key should be a shift between 1 and 25 inclusive.");
      this.key = key;
  }
  
  public String encrypt(String plaintext){
      StringBuilder ciphertext = new StringBuilder();
      plaintext = plaintext.toLowerCase();
      
      for(int i = 0; i < plaintext.length(); i++){
        char curr = plaintext.charAt(i);
        if(curr == ' '){
            ciphertext.append(" ");
        } else {
            int currIndex = plainAlphabet.indexOf(curr);
            int newLetterIndex = (currIndex + key) % 26;
            ciphertext.append(plainAlphabet.get(newLetterIndex));
        }
      }
      
      return ciphertext.toString();
  }
  public String decrypt(String ciphertext){
      StringBuilder plaintext = new StringBuilder();
      ciphertext = ciphertext.toLowerCase();
      
      for(int i = 0; i < ciphertext.length(); i++){
        char curr = ciphertext.charAt(i);
        if(curr == ' '){
            plaintext.append(" ");
        } else {
            int currIndex = plainAlphabet.indexOf(curr);
            int newLetterIndex = ((currIndex - key) % 26 + 26) % 26;
            plaintext.append(plainAlphabet.get(newLetterIndex));
        }
      }
      
      return plaintext.toString();
  }
}
