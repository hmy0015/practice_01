package com.javaex.practice;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long salary, savings;
		
		System.out.print("월급을 입력하세요 : ");
		salary = sc.nextInt();
		sc.close();

		savings = (salary * 10) * 12;
		System.out.println("10년동안 최대 저축액은 " + savings + "원 입니다.");
	}

}
