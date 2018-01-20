package com.wowsanta.crypto;

public class Version {
	private int major = 1;
	private int minor = 0;
		
	public double get(){
		return new Double(this.major  +  (minor/100));
	}
	public String toString(){
		return this.major + "." + this.minor;
	}
}
