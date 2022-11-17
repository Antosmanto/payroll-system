/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cagroup;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author Antoinette M. bolger
 */
public class aesClass {
    private SecretKey key;
    private final int keySize = 128;
    private final int Length = 128;
    private Cipher encryptionCipher;

    public void hide() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(keySize);
        key = keyGenerator.generateKey();
    }
    public String encrypt(String hide) throws Exception {
        byte[] dataInBytes = hide.getBytes();
        encryptionCipher = Cipher.getInstance("AES/GCM/NoPadding");
        encryptionCipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = encryptionCipher.doFinal(dataInBytes);
        return encode(encryptedBytes);
    }
    private String encode(byte[] hide) {
        return Base64.getEncoder().encodeToString(hide);
    }
   
    
    
    
    
}
