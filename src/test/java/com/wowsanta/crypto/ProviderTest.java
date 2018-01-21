package com.wowsanta.crypto;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;

import org.junit.Before;
import org.junit.Test;

public class ProviderTest {

	private Provider provider;
	@Before
	public void loadProvider(){
		provider = WowsantaProvider.addProvider();
		System.out.println("PROVIDER : " + provider.getInfo());
	}
	
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
	//@Test
	public void wowProvider(){
		KeyPairGenerator kpg;
		try {
			kpg = KeyPairGenerator.getInstance("EC", provider.getName());
			System.out.println("kpg : " + kpg.getAlgorithm());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		}
	}
}
