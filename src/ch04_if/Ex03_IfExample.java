package ch04_if;
import java.util.Scanner;


public class Ex03_IfExample {

	public static void main(String[] args) {
		/*
		 * 스캐너로 점수(score)를 하나 입력받아서
		 * 90점 이상이면 A
		 * 80점 이상이면 B
		 * 70점 이상이면 C
		 * 60점 이상이면 D
		 * 60점보다 적은 점수면 F
		 * 를 출력
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수: ");
		int num1 = scanner.nextInt();
		
		if(num1 >= 90) {
			System.out.println("A");
		}else if(num1 >= 80) {
			System.out.println("B");
		}else if(num1 >= 70) {
			System.out.println("C");
		}else if(num1 >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
	
}
