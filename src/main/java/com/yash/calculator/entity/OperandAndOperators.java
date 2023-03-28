package com.yash.calculator.entity;

public class OperandAndOperators {

	private double no1,no2;
	private String symbol;
		
	@Override
	public String toString() {
		return "OperandAndOperators [no1=" + no1 + ", no2=" + no2 + ", symbol=" + symbol + "]";
	}
	public double getNo1() {
		return no1;
	}
	public void setNo1(double no1) {
		this.no1 = no1;
	}
	public double getNo2() {
		return no2;
	}
	public void setNo2(double no2) {
		this.no2 = no2;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public OperandAndOperators(double no1, double no2, String symbol) {
		super();
		this.no1 = no1;
		this.no2 = no2;
		this.symbol = symbol;
	}
	public OperandAndOperators() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
