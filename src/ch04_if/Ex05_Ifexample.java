package ch04_if;

import java.util.Scanner;

public class Ex05_Ifexample {

	public static void main(String[] args) {
		// 정수 하나를 입력받아서 양수,음수,0인지 출력
		
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		if (num1 > 0){
			System.out.println("양수");
		}else if (num1 < 0){
			System.out.println("음수");
		}else{
			System.out.println("0");
		}

}
}
