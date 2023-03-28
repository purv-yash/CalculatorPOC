package com.yash.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yash.calculator.entity.OperandAndOperators;
import com.yash.calculator.entity.SingleOperatorOperations;
import com.yash.calculator.service.CalculatorService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("calculator")
public class MyController {

	@Autowired
	private CalculatorService calculatorService;
	
	public static double memory=0;
	
	
	@PostMapping("/binaryOperators")
	public double binaryOperation(@RequestBody OperandAndOperators operandAndOperators) {
		
		double a=operandAndOperators.getNo1();
		double b=operandAndOperators.getNo2();
		String symbol=operandAndOperators.getSymbol();
		return calculatorService.operation(a, b, symbol);
	}
	
	@PostMapping("/unaryOperators")
	public double unaryOperation(@RequestBody SingleOperatorOperations singleOperatorOperations ) {
		
		//System.out.println(singleOperatorOperations + "hii");
		
		double a=singleOperatorOperations.getNumber();
		String symbol=singleOperatorOperations.getSymbol();
		return calculatorService.extraOperation(a, symbol);
	} 
	
	@PostMapping("/mAdd")
	public String addMemory(@RequestParam int a) {
		memory = memory + a;
		return "Memory saved after addition:"+ memory;
	}
	
	@PostMapping("/mMinus")
	public String substractMemory(@RequestParam int a) {
		memory = memory - a;
		return "Memory saved after substraction:"+ memory;
	}	
	
	@GetMapping("/memory")
	public String memory() {
		return "Memory:"+ memory;
	}
}
