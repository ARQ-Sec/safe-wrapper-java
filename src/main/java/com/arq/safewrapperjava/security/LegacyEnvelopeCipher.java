package com.arq.safewrapperjava.security;
import javax.crypto.Cipher;
public class LegacyEnvelopeCipher { public Cipher cipher() throws Exception { return Cipher.getInstance("AES/ECB/PKCS5Padding"); } }
