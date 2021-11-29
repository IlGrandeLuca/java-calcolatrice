package org.generation.italy.utils;

public class CalcoliHelper {
	// Private builder
	private CalcoliHelper() {

	}

	public static int sum(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	public static double sum(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	public static int subtraction(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	public static double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	public static int multiplication(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	public static double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

//	public static int division(int firstNumber, int secondNumber) {
//		return firstNumber / secondNumber;
//	}
//
//	public static double division(double firstNumber, double secondNumber) {
//		return firstNumber / secondNumber;
//	}

	public static int absoluteValue(int number) {
		if (number >= 0) {
			return number;
		} else {
			return number * -1;
		}
	}

	public static double absoluteValue(double number) {
		if (number >= 0) {
			return number;
		} else {
			return number * -1;
		}
	}

	public static int minimum(int firstNumber, int secondNumber) {
		if (firstNumber <= secondNumber) {
			return firstNumber;
		} else {
			return secondNumber;
		}
	}

	public static double minimum(double firstNumber, double secondNumber) {
		if (firstNumber <= secondNumber) {
			return firstNumber;
		} else {
			return secondNumber;
		}
	}

	public static int maximum(int firstNumber, int secondNumber) {
		if (firstNumber >= secondNumber) {
			return firstNumber;
		} else {
			return secondNumber;
		}
	}

	public static double maximum(double firstNumber, double secondNumber) {
		if (firstNumber >= secondNumber) {
			return firstNumber;
		} else {
			return secondNumber;
		}
	}

	public static int calculatePower (int num, int exponent){
        if (exponent == 0)
            return 1;
        else
            return num * calculatePower(num, exponent - 1);
    }
}
