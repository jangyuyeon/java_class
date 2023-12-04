package ch04_if;

import java.util.Scanner;
public class Ea08_IfExample {

	public static void main(String[] args) {
		/*
		 * 서로 다른 정수 3개를 입력받아서 가장 큰 정수 출력하기
		 * (같은 숫자는 입력하지 않는다고 가정)
		 * 입력 예
		 *  첫번째 수:
		 *  두번째 수:
		 *  세번째 수:
		 *  
		 *  출력 예
		 *  가장 큰 숫자는 00입니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;
		System.out.println("첫번째 수: ");	
		num1 = scanner.nextInt();
		System.out.println("두번째 수: ");	
		num2 = scanner.nextInt();
		System.out.println("세번째 수: ");	
		num3 = scanner.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("가장 큰 수는" + num1);
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("가장 큰 수는" + num2);
			
		} else if(num3 > num1 && num3 > num2) {
			System.out.println("가장 큰 수는" + num3);
		}
	}

}
