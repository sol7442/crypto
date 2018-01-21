package com.wowsanta.crypto.ecc;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class ECCKeyFactory extends KeyFactorySpi {

	@Override
	protected PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected <T extends KeySpec> T engineGetKeySpec(Key key, Class<T> keySpec) throws InvalidKeySpecException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Key engineTranslateKey(Key key) throws InvalidKeyException {
		// TODO Auto-generated method stub
		return null;
	}

}
