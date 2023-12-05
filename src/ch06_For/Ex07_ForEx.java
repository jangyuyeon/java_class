package ch06_For;

import java.util.Scanner;

public class Ex07_ForEx {
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
        System.out.println("첫번째 수");
        int start = scanner.nextInt();
        System.out.println("두번째 수");
        int end = scanner.nextInt();

        int sum = 0;
        for(int i = start; i <=end ; i++){
            sum += i;
            if (i < end) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "=");
            }

        }
        System.out.println(sum);
        System.out.println(start + "부터 "+end +"까지의 합은 " + sum + "입니다.");
        }


    }

