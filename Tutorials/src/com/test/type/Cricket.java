package com.test.type;

public class Cricket implements Game, Exercise {
	public void play() {
		System.out.println("Playing Cricket...");
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public int getDuration() {
		return 0;
	}
	
}
