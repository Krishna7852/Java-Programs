package com.bridgeit.CommercialDataProcessing;

public class Transaction {
	private String buySell;
	private String symbol;
	private String date;
	private String customerName;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getBuySell() {
		return buySell;
	}

	public void setBuySell(String buySell) {
		this.buySell = buySell;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String toString()

	{
		return "\n\tTransaction:- \n\tName: " + customerName + "\n\tBuySell: " + buySell + "\n\tSymbol: " + symbol
				+ "\n\tDate: " + date;
	}
}
