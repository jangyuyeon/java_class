package ch09_array;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class Ex07_ArrayEx {
    public static void main(String[] args) {
        /**
         * 크기가 5인 정수형 배열을 선언하고
         * 스캐너로 배열에 값을 정한 뒤
         * 입력된 값 중에서 가장 큰 값을 출력
         */
        Scanner scanner = new Scanner(System.in);
        int[] numbers1 = new int[5];//크기가 5인 정수형

        int max = 0;//최대값을 담기 위한 변수
        System.out.println("숫자를 입력하세요: ");

        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = scanner.nextInt();//입력할 수 있는 칸
            if(numbers1[i] > max){
                max = numbers1[i];
                //배열하는 값이 맥스보다 크면 입력
            }

            // numbers1 > 큰값을 구하자
        }
        System.out.println(max);


    }
}
