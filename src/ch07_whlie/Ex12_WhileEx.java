package ch07_whlie;

import java.util.Scanner;

public class Ex12_WhileEx {
    public static void main(String[] args) {
        /**
         * random()매서드를 이용해서 1~100사이의 숫자를 하나 만들고
         * 반복문 안에서 해당 숫자를 맞출때까지 계속 숫자를 입력받도록 하고
         * 숫자를 맞추면 종료하고 몇 번만에 맞췄는지를 출력해줌
         */
        Scanner scanner = new Scanner(System.in); //스캐너로 입력받고
        int i = (int) (Math.random() * 100) + 1; //i라는 변수에 1~100까지 숫자를 무작위로 설정해주고
        System.out.println(i); //i를 출력한다.

        boolean run = true; //run이 진실이면
        int check = 0; //시도횟수 체크때문에 필요한 변수이다.
        while (run) {
            System.out.println("숫자를 입력하세요");
            int num1 = scanner.nextInt();
            if (i == num1) {    //만약 i라는 무작위 숫자와 입력한 num1이 같다면 run은 거짓이므로 멈추고 "맞췄습니다"를 출력하자
                run = false;
                System.out.println("밎췄습니다.");
            } else if (i > num1) { //만약 i가 num1보다 크다면 "낮춰주세요"출력
                System.out.println("낮춰주세요.");
            } else if (i < num1) {//만약 i가 num1보다 작다면 "높여주세요"출력
                System.out.println("높여주세요.");
            }
            check++; //시도횟수를 계속 1씩 증가
        }
        System.out.println("시도횟수는 " + check);
    }
}
