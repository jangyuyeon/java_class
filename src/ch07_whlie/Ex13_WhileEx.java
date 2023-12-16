package ch07_whlie;

import java.util.Scanner;

public class Ex13_WhileEx {
    public static void main(String[] args) {
         /*정수를 입력하고 마지막에 0을 입력하세요 :
        120
        입력한 숫자는 2개 입니다.
        평균은 1입니다.

          */
        Scanner scan = new Scanner(System.in);
        int num1 = 0;       //입력받은 숫자용 변수
        int sum = 0;       //합계용 변수
        int avg = 0;       //평균용 변수
        int count = 0;     //횟수용 변수
        boolean run = true; //run은 진실
        System.out.println("정수를 입력하고 마지막에 0을 입력하세요"); //출력하기

        while (run) { //run하는동안
            num1 = scan.nextInt(); // num1을 입력받고
            System.out.println("num1 = " + num1);
            if (num1 == 0) { //만약에 num1이랑 0이랑 같다면
                run = false; //run은 거짓이다.멈추자
            } else { //그밖에
                sum += num1; //합계는 변수 num1을 합친값
                count++; // 횟수를 1씩 증가
            }
        }
        avg = sum / count; //평균값은 합계나누기 횟수
        System.out.println("입력한 숫자는 " + count + "입니다.");
        System.out.println("평균은 " + avg + "입니다.");

    }
}
