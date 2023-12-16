package ch09_array;

import java.util.Scanner;

public class Ex13_ArrayEx {
    public static void main(String[] args) {
        /**
         * 크기가 5인 정수형 배열을 선언하고
         * 스캐너로 배열에 값을 정한 뒤
         * 입력된 값 중에서 가장 큰 값을 출력
         */
        Scanner scanner = new Scanner(System.in);
        int[] numbers1 = new int[5];//크기가 5인 정수형 배열은 선언하고
        System.out.println("숫자를 입력하세요: "); //숫자를 입력받고

        int max = 0; //최대값을 0으로 초기화
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = scanner.nextInt();
            if (max < numbers1[i]) {
                max = numbers1[i];
            }
        }
        System.out.println(max);
    }
}
