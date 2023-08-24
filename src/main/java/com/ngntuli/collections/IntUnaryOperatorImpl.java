package com.ngntuli.collections;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorImpl implements IntUnaryOperator {
	private int[] iArray;

	public void setArray(int[] iArray) {
		this.iArray = iArray;
	}

	@Override
	public int applyAsInt(int operand) {
		if (iArray != null) {
			return iArray[operand] + 5;
		} else {
			return operand;
		}
	}

}
