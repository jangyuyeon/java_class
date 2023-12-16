package ch09_array;

import java.util.Scanner;

public class Ex11_ArrayEx {
    public static void main(String[] args) {
        /**
         * 크기가 3인 정수형 배열을 선언하고
         * 실행 했을 때 스캐너로 정수값을 입력받아 배열에 저장
         * 배열에 저장된 값의 총합,평균 계산
         */
        Scanner scanner = new Scanner(System.in);
        int[] numbers1 = new int[3];

        System.out.println("첫번째 값을 출력하세요");
        numbers1[0] = scanner.nextInt();
        System.out.println("두번째 값을 출력하세요");
        numbers1[1] = scanner.nextInt();
        System.out.println("세번째 값을 출력하세요");
        numbers1[2] = scanner.nextInt();
        System.out.println("네번째 값을 출력하세요");
        numbers1[3] = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println("입력받고 싶은 인덱스를 입력하세요. ");
            numbers1[i] = scanner.nextInt();

            sum += numbers1[i];
        }
        System.out.println(sum);
        System.out.println("평균은" + sum / numbers1.length);
    }
}