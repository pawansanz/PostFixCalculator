package com.bitwise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PostfixApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostfixApplication.class, args);
	}

	public static int eval(String input) throws Exception{

		int result1 = Integer.parseInt(input.split(" ")[0]);
		int result2 = Integer.parseInt(input.split(" ")[1]);
		String result3 = input.split(" ")[2];

		if (result3.equals("+")) {
			return result1 + result2;
		} else if (result3.equals("-")) {
			return result1 - result2;
		} else if (result3.equals("*")) {
			return result1 * result2;
		} else if (result3.equals("/")) {
			return result1 / result2;
		} else {
			throw new IncorrectInputException();
		}
	}
}

class IncorrectInputException extends Exception {
}