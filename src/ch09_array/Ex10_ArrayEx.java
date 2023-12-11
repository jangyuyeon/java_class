package ch09_array;

import java.util.Scanner;

public class Ex10_ArrayEx {
    public static void main(String[] args) {
        int select = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("1.학생수입력 | 2.점수입력 |3.점수목록 |4.분석| 5.종료");
        System.out.println("-------------------------------------------------");
        System.out.println("선택 >");

        if (select == 1) {
            System.out.println("학생수입력");
        } else if (select == 2) {
            System.out.println("2.점수입력");
        } else if (select == 3) {
            System.out.println("3.점수목록");
        } else if (select == 4) {
            System.out.println("4.분석");
        } else {
            System.out.println("5.종료");
        }
    }
}

