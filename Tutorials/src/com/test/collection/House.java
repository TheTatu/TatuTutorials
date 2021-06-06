package com.test.collection;

public class House {
	private String houseNumber;
	private int maleMembers;
	private int femaleMembers;

	public House(String houseNumber, int maleMembers, int femaleMembers) {
		this.houseNumber = houseNumber;
		this.maleMembers = maleMembers;
		this.femaleMembers = femaleMembers;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public int getMaleMembers() {
		return maleMembers;
	}

	public void setMaleMembers(int maleMembers) {
		this.maleMembers = maleMembers;
	}

	public int getFemaleMembers() {
		return femaleMembers;
	}

	public void setFemaleMembers(int femaleMembers) {
		this.femaleMembers = femaleMembers;
	}
	
	@Override
	public String toString() {
		return this.houseNumber + "=>female:" + this.maleMembers + "::male:" + this.femaleMembers;
	}

}