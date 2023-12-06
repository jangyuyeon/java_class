package ch07_whlie;

import java.util.Scanner;

public class Ex05_WhileEx {
    public static void main(String[] args) {
        /**
         * random()매서드를 이용해서 1~100사이의 숫자를 하나 만들고
         * 반복문 안에서 해당 숫자를 맞출때까지 계속 숫자를 입력받도록 하고
         * 숫자를 맞추면 종료하고 몇 번만에 맞췄는지를 출력해줌
         */
        Scanner scanner = new Scanner(System.in);
        int dice = (int) ((Math.random() * 10)) + 1;
        System.out.println(dice);

        boolean run = true;
        int check = 0;
        while (run) {
            System.out.println("숫자를 입력하세요.");
            int num1 = scanner.nextInt();

            if(dice == num1){
                run = false;
                System.out.println("맞췄습니다.");
            }else if(dice > num1){
                System.out.println("더 큰수를 입력하세요");
            }else if(dice < num1){
                System.out.println("더 작은수를 입력하세요");
            }
            check++;
        }
        System.out.println("시도횟수는 "+ check);

    }
}