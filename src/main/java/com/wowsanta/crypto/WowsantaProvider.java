package com.wowsanta.crypto;

import java.security.Provider;
import java.security.Security;

import com.wowsanta.crypto.ecc.ECCKeyPairGenerator;

public class WowsantaProvider extends Provider{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2409297330507367573L;
	
	public static String NAME = "WOWSANTA";
	private static  Version ver = new Version();
	
	public WowsantaProvider() {		
		super(NAME, ver.get(), NAME + " Security Provider : " + ver);
		putAlgorithm();
	}


	/**
	 * if already installed then reinstalled	  
	 * @return installed provider
	 */
	public static Provider addProvider(){
		Security.removeProvider(NAME);
		Security.addProvider(new WowsantaProvider());
		return Security.getProvider(NAME);
	}
	/**
	 * if already installed then do not work install
	 * @return
	 *    if already installed return -1
	 *    else return installed index
	 */
	public static int addAsProvider(){
		return Security.addProvider(new WowsantaProvider());
	}
	
	private void putAlgorithm() {
		//put(key, value);
		//KeyPAriGenerator
		//SecretKeyFactory
		//MessageDigest
		//AlgorithmParameters
		//Mac
		//Signature
		//SecureRandom
		//Cipher 
		//System.out.println(ECCKeyPairGenerator.class.getCanonicalName());
		put("KeyPairGenerator.EC",ECCKeyPairGenerator.class.getCanonicalName());
	}
}
