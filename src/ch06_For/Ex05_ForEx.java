package ch06_For;

import java.util.Scanner;

public class Ex05_ForEx {
    public static void main(String[] args) {
        /*
        1부터 10까지의 합계 출력
         */
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
//      sum =10;
//      sum = sum + i;
            sum += i;
            System.out.println("i=" + i);
            System.out.println("sum = " + sum);
        }
        System.out.println("for문 종료 후 sum = " + sum);
    }
}
