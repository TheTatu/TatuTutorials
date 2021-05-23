package com.test.type;

/**
 * "Inheritance" is "IS-A" relationship.
 * 
 * @author Yogi
 *
 */
public class KapalBharati implements Exercise {

	@Override
	public String getName() {
		return "KapalBharati";
	}

	@Override
	public int getDuration() {
		return 2;
	}

}
