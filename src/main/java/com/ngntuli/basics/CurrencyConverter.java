package com.ngntuli.basics;

public class CurrencyConverter {

	static double[] exchangeRates;

	void setExchangeRates(double[] rates) {
		exchangeRates = rates;
	}

	void updateExchangeRate(int arrayIndex, double newVal) {
		exchangeRates[arrayIndex] = newVal;
	}

	double getExchangeRate(int arrayIndex) {
		return exchangeRates[arrayIndex];
	}

	double computeTransferAmount(int arrayIndex, double amount) {
		return amount * getExchangeRate(arrayIndex);
	}

	static void printCurrencies() {
		System.out.println("\n*** Currency exchange rates of different currencies relative to $1 US dollar ***");
		System.out.println("\nSouth African Rand: " + exchangeRates[0]);
		System.out.println("Mozambican Metical: " + exchangeRates[1]);
		System.out.println("Egyptian Pound: " + exchangeRates[2]);
		System.out.println("Malawian Kwacha: " + exchangeRates[3]);
		System.out.println("Nigerian Naira: " + exchangeRates[4]);
		System.out.println("Tanzanian Shilling: " + exchangeRates[5]);
		System.out.println("Ugandan Shilling: " + exchangeRates[exchangeRates.length - 1]);
	}

	public static void main(String[] args) {
		CurrencyConverter cc = new CurrencyConverter();

		// Jan 1st
		double[] rates = { 18.22, 63.25, 30.90, 1027.50, 461.50, 2357.00, 3723.87 };
		cc.setExchangeRates(rates);

		cc.printCurrencies();

		rates = new double[] { 19.23, 63.25, 30.90, 1027.50, 461.50, 2357.00, 3723.87 };
		cc.setExchangeRates(rates);

		cc.printCurrencies();

		cc.updateExchangeRate(0, 18.80);
		cc.printCurrencies();

		double amount = cc.computeTransferAmount(0, 1000);
		System.out.println("\nTransferred amount: " + amount);
	}
}
