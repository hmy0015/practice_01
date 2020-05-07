package com.javaex.practice;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int _500won, _100won, _50won, _10won, money;
		
		System.out.print("500원의 개수 : ");
		_500won = sc.nextInt() * 500;
		
		System.out.print("100원의 개수 : ");
		_100won = sc.nextInt() * 100;
		
		System.out.print("50원의 개수 : ");
		_50won = sc.nextInt() * 50;
		
		System.out.print("10원의 개수 : ");
		_10won = sc.nextInt() * 10;
		
		money = _500won + _100won + _50won + _10won;
		
		System.out.println("동전의 총합은 " + money +"원 입니다.");
		
		sc.close();
	}
}
