package ch06_For;

import java.util.Scanner;

public class Ex12_ForEx {
    public static void main(String[] args) {
        /**
         * 정수를 하나 입력받고
         * 1부터 입력받은 정수까지의 정수 중에서
         * 2의 배수, 3의배수를 제외한 수의 총 합 출력
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int i = scanner.nextInt();
        int sum = 0;
        for(int x = 1; x <= i; x++ ){
            if (x % 2 != 0 && x % 3 != 0 ){
               sum += i;
            }
        }
        System.out.println(sum);

    }
}
