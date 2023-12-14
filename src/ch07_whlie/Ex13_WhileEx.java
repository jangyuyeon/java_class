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
        boolean run = true;
        System.out.println("정수를 입력하고 마지막에 0을 입력하세요");

        while (run) {
            num1 = scan.nextInt();
            System.out.println("num1 = " + num1);
            if (num1 == 0) {
                run = false;
            } else {
                sum += num1;
                count++;
            }
        }
        avg = sum / count;
        System.out.println("입력한 숫자는 " + count + "입니다.");
        System.out.println("평균은 " + avg + "입니다.");

    }
}
