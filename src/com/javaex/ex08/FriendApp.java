package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inputLine;
		String[] inputArray;
		Friend[] fArray = new Friend[3];
		
		System.out.println("친구 3명을 등록해 주세요");
		
		for(int i=0; i<3; i++) {
			inputLine = sc.nextLine();
			inputArray = inputLine.split(" ");
			fArray[i] = new Friend(inputArray[0], inputArray[1], inputArray[2]);
		}
		
		for(int i=0; i<3; i++) {
			fArray[i].showInfo();
		}
		
		sc.close();

	}

}
