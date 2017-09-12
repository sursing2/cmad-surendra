package com.cmad.api;

import java.security.Key;

import javax.crypto.spec.SecretKeySpec;

public class KeyGenerator {
	public static final KeyGenerator INSTANCE = new KeyGenerator();
	public Key generateKey() {
		String keyString = "SomeSecret";
		Key key = new SecretKeySpec(keyString.getBytes(), 0, keyString.getBytes().length, "DES");
		return key;
	}
}
