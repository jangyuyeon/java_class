package ch07_whlie;

import java.util.Scanner;

public class Ex06_WhileEx {
    public static void main(String[] args) {
        /*정수를 입력하고 마지막에 0을 입력하세요 :
        120
        입력한 숫자는 2개 입니다.
        평균은 1입니다.

         */

        Scanner scanner = new Scanner(System.in); //스캐너로 출력하기
        int i = 0; //i에 0이라는 정수를 대입하고
        System.out.println(i + "0"); //
        int count = 0; //횟수 변수 
        int avg = 0; //평균변수
        int sum = 0;//합계 변수

        while (true) { //진실인 동안
            System.out.println("정수를 입력하고 마지막에 0을 입력하세요"); //출력하고
                sum = 0;  //합계와 횟수를 
                count = 0; 
            while ((i = scanner.nextInt()) != 0) {
                count++;      //횟수를 1씩 증가
                sum += i; //합계는 정수의 합

            }
                avg = sum / count; //평균은 합 나누기 횟수 식
            System.out.println("입력한 숫자는 " + count + "입니다."); //출력하기
            System.out.println("평균은 " + avg + "입니다.");
        }
    }

    }

