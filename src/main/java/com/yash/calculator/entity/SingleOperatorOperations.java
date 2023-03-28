package com.yash.calculator.entity;

public class SingleOperatorOperations {

	private int number;
	private String symbol;
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public SingleOperatorOperations(int number, String symbol) {
		super();
		this.number = number;
		this.symbol = symbol;
	}
	public SingleOperatorOperations() {
		super();
		// TODO Auto-generated constructor stub
	}	
//	@Override
//	public String toString() {
//		return "SingleOperatorOperations [number=" + number + ", symbol=" + symbol + "]";
//	}
}
