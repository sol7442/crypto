package com.wowsanta.crypto.ecc;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyPairGeneratorSpi;
import java.security.SecureRandom;

public class ECCKeyPairGenerator extends KeyPairGeneratorSpi{

	@Override
	public KeyPair generateKeyPair() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initialize(int keysize, SecureRandom random) {
		
	}
	public void initialize(int keysize){
		
	}
	

}
