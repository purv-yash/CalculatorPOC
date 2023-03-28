package com.yash.calculator.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
	
	@Cacheable(cacheNames = "calculations" , key = "#p0")
	public double operation(double no1, double no2, String symbol) {
		double result=0;
		System.out.println("method is running");
		
		switch(symbol) {
		case "+": result= no1+ no2;
		break;
		case "-": result= no1- no2;
		break;
		case "*": result= no1* no2;
		break;
		case "/": result= no1/ no2;
		break;
		}
		
		return result;
	}

	@Cacheable(cacheNames = "calculations" , key = "#p0")
	public double extraOperation(double number, String symbol) {

		double result=0;
		System.out.println("method is running");
		//System.out.println(number + symbol);
		
		switch(symbol) {
		case "sqr": result= number* number;
		break;
		case "sqrRoot": result= Math.sqrt(number);
		break;
		case "inverse": result= 1/number;
		break;
		case "sin": double rad1= Math.toRadians(number);
					result= Math.sin(rad1);
		break;
		case "cos": double rad2= Math.toRadians(number);
					result= Math.cos(rad2);
		break;
		case "tan": double rad3= Math.toRadians(number);
					result= Math.tan(rad3);
		break;
		case "cot": double rad4= Math.toRadians(number);
					result= 1/Math.tan(rad4);
		break;
		case "sec": double rad5= Math.toRadians(number);
					result= 1/Math.cos(rad5);
		break;
		case "cosec":double rad6= Math.toRadians(number);
					result= 1/Math.sin(rad6);
		break;
		case "log": result= Math.log(number);
		break;
		case "fact":int i;
					result=number;
					for(i=1;i<number;i++) 
						{
						result =  result*i;
						}
		break;
		
		}
		return result;
	}
}
