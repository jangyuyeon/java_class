package ch07_whlie;

public class Ex04_WhileEx {
    public static void main(String[] args) {
        /**
         * random()매서드 이용해서 1~6이 나오는 주사위를 설정하고
         * 주사위가 계속 던져지면서 6이 나오면 종료되는 코드 작성
         */
        int i = 1;
        while (i != 6) {//i가 6이 아닌동안
            //저장을 하고 6인지 아닌지를 판단
            i = (int)((Math.random() * 6)) + 1; //i라는 변수에 1~6까지의 무작위 숫자를 대입한다.
            System.out.println(i); //i를 출력한다.
        }

    }
}
