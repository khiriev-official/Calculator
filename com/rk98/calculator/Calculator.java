/* Calculator Program
Functionality:
1. Operations: +, -, /, *.
2. Input: String inp = "<int: 1st number> <int: 2nd number> <String: operation>".
3. Output: System.out.println(result).

Stages:
1. Create a Class with methods for each operation and generator implementing
these operations.
2. Create a GUI.
	2.1 Create a simple window with one input line, output line and 
	"submit" button.
		2.1.1 Create Window - DONE!
		2.1.2 Add Name for a Window - when program in Calculator.jar
		2.1.3 Add input line - 
	2.2 
...
N.
 */
package com.rk98.calculator;


import com.rk98.calculator.gui.CalculatorGUI;

import java.util.Scanner;


public class Calculator {


	public Calculator() {  // Perform operations without creating objects
		double result = 0;
		System.out.println("Type 1st 2nd numbers and operation");
		Scanner scan = new Scanner(System.in);
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		String operation = scan.next();

		if (operation.equals("+")) result = num1 + num2;
		if (operation.equals("-")) result = num1 - num2;
		if (operation.equals("*")) result = num1 * num2;
		if (operation.equals("/")) result = num1 / num2;

		System.out.println("Result: " + result);
	}


	public static void main(String[] args){
		//Calculator calc = new Calculator();
		double result = Calculator.calculate(7, 3, "/");
		System.out.println(result);
		CalculatorGUI g = new CalculatorGUI();
	}


	public static double calculate(double a, double b, String op){


		double result = 0;
		switch(op) {  // add new operations here
			case "+": 
				result = a + b;
				break;
			case "-": 
				result = a - b;
				break;
			case "*": 
				result = a * b;
				break;
			case "/":
				result = a / b;
				break;
			default: System.out.println("Error occured...");
		}

		return result;
	}
}

