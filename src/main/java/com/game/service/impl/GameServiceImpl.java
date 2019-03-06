package com.game.service.impl;

import java.math.BigInteger;
import java.util.regex.Pattern;

import com.game.service.GameService;

public class GameServiceImpl implements GameService {

	@Override
	public int fizzbuzzFun() {
		int i = 1;
		while (i <= 100) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
			i++;
		}
		return i;
	}

	@Override
	public String fizzbuzzFun(String inputNumber) {
		boolean isNumeric = Pattern.compile("^[-\\+]?[\\d]*$")
				.matcher(inputNumber).matches();
		if (isNumeric) {
			BigInteger bigInt = new BigInteger(inputNumber);
			BigInteger three = new BigInteger("3");
			BigInteger five = new BigInteger("5");
			if (bigInt.remainder(three).intValue() == 0
					&& bigInt.remainder(five).intValue() == 0) {
				return "FizzBuzz";
			} else if ((bigInt.remainder(three).intValue() == 0)) {
				return "Fizz";
			} else if ((bigInt.remainder(five).intValue() == 0)) {
				return "Buzz";
			} else {
				return inputNumber;
			}
		}
		boolean isChar = Pattern.compile("[\\d]*[a-zA-Z]+[\\d]*")
				.matcher(inputNumber).matches();
		if (isChar) {
			return "N/A";
		}
		if (inputNumber.contains("3") && inputNumber.contains("5")) {
			return "FizzBuzz";
		} else if (inputNumber.contains("3")) {
			return "Fizz";
		} else if (inputNumber.contains("5")) {
			return "Buzz";
		} else {
			return inputNumber;
		}
	}

}
