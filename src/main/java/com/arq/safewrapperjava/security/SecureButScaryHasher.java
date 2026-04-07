package com.arq.safewrapperjava.security;
import java.security.MessageDigest;
public class SecureButScaryHasher { public byte[] digest(byte[] value) throws Exception { return MessageDigest.getInstance("SHA-256").digest(value); } }
