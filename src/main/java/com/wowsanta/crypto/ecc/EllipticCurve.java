package com.wowsanta.crypto.ecc;

import java.math.BigInteger;

public class EllipticCurve {
	private final ECCField   f;
	private final BigInteger a;
	private final BigInteger b;
	private final byte[] seed;
	
	public EllipticCurve(ECCField f, BigInteger a, BigInteger b, byte[] seed) {
		this.f = f;
		this.a = a;
		this.b = b;
		this.seed = seed.clone();
	}
}
