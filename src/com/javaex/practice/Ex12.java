package com.javaex.practice;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final float pi = 3.14f; // 파이값을 3.14로 지정
		float area; // 원의 넓이
		
		System.out.print("반지름을 입력하세요 : ");
		float radius = sc.nextFloat(); // 반지름 변수 선언 및 입력
		sc.close(); // 스캐너 종료
		
		area = (radius * 2) * pi; // 원의 넓이 구하는 공식을 변수에 대입
		
		System.out.print("원의 넓이는 " + area); // 출력
		
	}
}
