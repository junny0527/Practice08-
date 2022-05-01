package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean value = true;

		String[] inputArr = null;

		while (value) {

			System.out.print("계산할 식을 입력해주세요 [ 종료를 원하시면 '/q'를 입력해주세요. ] : ");

			String input = sc.nextLine();
			if (input.equals("/q")) {
				System.out.println("종료되었습니다.");
				value = false;
			} else {
				System.out.print(" >> ");

				// 공백제거
				String trimInput = input.replaceAll(" ", "");

				if (trimInput.indexOf("+") > -1) {
					// 더하기인 경우

					// +를 기준으로 Split
					// 결과값
					inputArr = trimInput.split("\\+");

					Add add = new Add();
					add.setValue(Integer.parseInt(inputArr[0]), Integer.parseInt(inputArr[1]));
					System.out.println(add.calculate());

				} else if (trimInput.indexOf("-") > -1) {
					// 빼기인 경우

					// -를 기준으로 split
					inputArr = trimInput.split("-");

					Sub sub = new Sub();
					sub.setValue(Integer.parseInt(inputArr[0]), Integer.parseInt(inputArr[1]));
					System.out.println(sub.calculate());

				} else if (trimInput.indexOf("*") > -1) {
					// 곱하기인 경우

					// *를 기준으로 split
					inputArr = trimInput.split("\\*");

					Mul mul = new Mul();
					mul.setValue(Integer.parseInt(inputArr[0]), Integer.parseInt(inputArr[1]));
					System.out.println(mul.calculate());

				} else if (trimInput.indexOf("/") > -1) {
					// 나누기인 경우

					// /를 기준으로 split
					inputArr = trimInput.split("/");

					Div div = new Div();
					div.setValue(Integer.parseInt(inputArr[0]), Integer.parseInt(inputArr[1]));
					System.out.println(div.calculate());
				} else {
					System.out.println("알 수 없는 피연산자입니다.");
				}
			}
		}
		sc.close();
	}

}