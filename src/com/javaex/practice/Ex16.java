package com.javaex.practice;
import java.util.Scanner;

public class Ex16 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			float price, money, surtax, change;
			
			System.out.print("상품가격 : ");
			price = sc.nextFloat();

			System.out.print("받은돈 : ");
			money = sc.nextFloat();
			
			sc.close();
			
			surtax = price * 0.1f;
			change = money - price;
			
			System.out.println("=========================");
			System.out.println("받은돈 : " + (int)money + "원");
			System.out.println("상품가격 : " + (int)price + "원");
			System.out.println("부가세 : " + (int)surtax + "원");
			System.out.println("잔액 : " + (int)change + "원");
			
	}
}
