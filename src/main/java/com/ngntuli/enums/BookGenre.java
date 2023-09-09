package com.ngntuli.enums;

public enum BookGenre {
	BIOGRAPHY(12), HORROR(15);

	private BookGenre(int minAgeToRead) {
		this.minAgeToRead = minAgeToRead;
	}

	private int minAgeToRead;

	public int getMinAgeToRead() {
		return minAgeToRead;
	}

}
