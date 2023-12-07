package ch08_string;

import java.util.Scanner;

public class Ex02_StringEx {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 '종료'를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        String inputString = "";//입력 스트링
        boolean run = true;
        String answer = "종료";
        // 프로그램을 종료하는 키워드인 종료 가 절대로 바뀌지 않을 경우
        final String ANSWER = "종료";//변수앞에 final을 붙이면 여기에 저장되는 값이 마지막이다. FINAL에 저장된 값은 바꿀 수 없다는 뜻
        // final 키워드를 붙인 변수는 변수값을 바꿀 수 없음.
//		ANSWER = "다른값저장";
        do {
            System.out.print(">");
            inputString = scan.nextLine();
            System.out.println(inputString);
            if(inputString.equals(ANSWER)) {
                run = false;
            }
        } while(run);

    }
}