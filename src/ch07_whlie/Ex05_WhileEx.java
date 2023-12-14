package ch07_whlie;

import java.util.Scanner;

public class Ex05_WhileEx {
    public static void main(String[] args) {
        /**
         * random()매서드를 이용해서 1~100사이의 숫자를 하나 만들고
         * 반복문 안에서 해당 숫자를 맞출때까지 계속 숫자를 입력받도록 하고
         * 숫자를 맞추면 종료하고 몇 번만에 맞췄는지를 출력해줌
         */
        Scanner scanner = new Scanner(System.in); //스캐너로 입력받고
        int dice = (int) ((Math.random() * 10)) + 1; //1부터 10까지의 정수를 입력받은 값을 dice변수에 입력
        System.out.println(dice); //dice를 출력하기

        boolean run = true; //run이 진실이면
        int check = 0; //체크 변수는 0으로 초기화
        while (run) { //run인 동안
            System.out.println("숫자를 입력하세요."); //"숫자를 입력하세요" 출력하기
            int num1 = scanner.nextInt(); // 입력받은 num1을 출력하라

            if(dice == num1){ //만약 dice정수와 num1이 같다면
                run = false;  //run은 거짓 멈추기!
                System.out.println("맞췄습니다."); //"맞첬습니다"를 출력하기
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