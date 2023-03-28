package com.yash.calculator.service;

import org.springframework.stereotype.Service;


public interface CalculatorService {

	public double operation(double no1,double no2,String symbol);
	public double extraOperation(double number,String symbol);
	
}
