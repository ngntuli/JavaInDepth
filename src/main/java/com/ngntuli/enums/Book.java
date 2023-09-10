package com.ngntuli.enums;

public class Book {
	public enum BookGenre {
		BIOGRAPHY(12) {
			@Override
			public boolean isKidFriendly(int age) {
				return age >= minAgeToRead;
			}
		},
		HORROR(15) {
			@Override
			public boolean isKidFriendly(int age) {
				return false;
			}
		};

		public abstract boolean isKidFriendly(int age);

		private BookGenre(int minAgeToRead) {
			this.minAgeToRead = minAgeToRead;
		}

		protected int minAgeToRead;

		public int getMinAgeToRead() {
			return minAgeToRead;
		}

//		public boolean isKidFriendly(int age) {
//			switch (this) {
//			case BIOGRAPHY:
//				return age >= minAgeToRead;
//			case HORROR:
//				return false;
//			}
//			return false;
//			// throw new AssertionError("Unknown operation: " + this);
//		}

	}
}
