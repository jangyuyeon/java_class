package ch07_whlie;

import java.util.Scanner;

public class Ex06_WhileEx {
    public static void main(String[] args) {
        /*정수를 입력하고 마지막에 0을 입력하세요 :
        120
        입력한 숫자는 2개 입니다.
        평균은 1입니다.

         */

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println(i + "0");
        int count = 0;
        int avg = 0;

        int sum = 0;

        while (true) {
            System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
                sum = 0;
                count = 0;
            while ((i = scanner.nextInt()) != 0) {
                count++;
                sum += i;

            }
                avg = sum / count;
            System.out.println("입력한 숫자는 " + count + "입니다.");
            System.out.println("평균은 " + avg + "입니다.");
        }
    }


    }

