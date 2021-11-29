package org.generation.italy.utils;

public class CalcoliHelperBonus {

	private CalcoliHelperBonus() {

	}

	public static double calculatePower(double num, int exponent) {
		double res = 1;
		if (num > 0 && exponent == 0) {
			return res;
		} else if (num == 0 && exponent >= 1) {
			return 0;
		} else if (exponent < 0) {
			num = 1 / num;
			exponent = -exponent;
			for (int i = 1; i <= exponent; i++) {
				res *= num;
			}
			return res;
		} else {
			for (int i = 1; i <= exponent; i++) {
				res *= num;
			}
			return res;
		}
	}
}
