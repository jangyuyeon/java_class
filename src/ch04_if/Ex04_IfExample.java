package ch04_if;
import java.util.Scanner;

public class Ex04_IfExample {

	public static void main(String[] args) {
		/*
		 * 중첩 if문을 적용한 학점 출력
		 * 100점을 초과하거나 0점 미만의 점수를 입력하면 '입력범위를 초과하였습니다.'출력
		 * 0~100 점 사이의 값을 입력했다면 앞의 예제에서 했던 학점 출력을 진행함.
		 * 단, 각 조건마다 학점값을 출력하는 것이 아니라 학점 출력을 위한 print 문장은 한번만 사용
		 */
		Scanner scanner = new Scanner(System.in);
				System.out.println("점수: ");
		int num1 = scanner.nextInt();
		String num2 = "";
		
		if(num1 > 100 || num1 < 0) {
			System.out.println("입력범위를 초과하였습니다.");
		}if(num1 >= 90) {
			num2 = "A";
		}else if(num1 >= 80) {
			num2 = "B";
		}else if(num1 >= 70) {
			num2 = "C";
		}else if(num1 >= 60) {
			num2 = "D";
		}else {
			num2 = "F";
		}
	}else {
		System.out.println("입력범위를 초과하였습니다.");
	}	
	System.out.println("학점은" + num2 + "입니다.");
	

