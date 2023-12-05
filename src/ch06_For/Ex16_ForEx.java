package ch06_For;

import java.util.Scanner;

public class Ex16_ForEx {
    public static void main(String[] args) {
       /*
        두개의 정수를 입력받아서 시작값부터 끝까지의 합계 출력
        입력 예
        시작값:110
        끝값: 555
        출력 예
        110부터 555까지의 합은 000입니다.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("시작 값: ");
        int start = scanner.nextInt();
        System.out.println("끝 값: ");
        int end = scanner.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("합은" + sum);
        System.out.println(start + "부터" + end + "까지의 합은" + sum + "입니다.");
    }
}

