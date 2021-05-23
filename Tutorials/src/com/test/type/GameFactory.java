package com.test.type;

public class GameFactory {
	private Cricket cricket;
	private Hockey hockey;
	private Tennis tennis;

	public GameFactory() {
		this.cricket = new Cricket();
		this.hockey = new Hockey();
		this.tennis = new Tennis();
	}

	public Cricket getCricket() {
		return cricket;
	}

	public void setCricket(Cricket cricket) {
		this.cricket = cricket;
	}

	public Hockey getHockey() {
		return hockey;
	}

	public void setHockey(Hockey hockey) {
		this.hockey = hockey;
	}

	public Tennis getTennis() {
		return tennis;
	}

	public void setTennis(Tennis tennis) {
		this.tennis = tennis;
	}

	public Game getGame(int seq) {
		switch (seq) {
		case 1:
			return cricket;
		case 2:
			return hockey;
		case 3:
			return tennis;
		default:
			System.out.println("Invalid choice");
			return null;
		}
	}
}
