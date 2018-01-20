package com.wowsanta.crypto;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import org.junit.Test;

public class ProviderTest {

	@Test
	public void sunProvider(){
		try {
			KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC", "SunEC");
			System.out.println("kpg : " + kpg.getAlgorithm());
			
			kpg.initialize(128);
			
			KeyPair kyp = kpg.generateKeyPair();			
			
			System.out.println("public : " + kyp.getPublic());			
			System.out.println("private : " + kyp.getPrivate());
			
			
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		}
	}
}
