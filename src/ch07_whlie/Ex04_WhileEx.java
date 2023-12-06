package ch07_whlie;

public class Ex04_WhileEx {
    public static void main(String[] args) {
        /**
         * random()매서드 이용해서 1~6이 나오는 주사위를 설정하고
         * 주사위가 계속 던져지면서 6이 나오면 종료되는 코드 작성
         */
        int i = 1;
        while (i != 6) {//1~6의
            //저장을 하고 6인지 아닌지를 판단
            i = (int)((Math.random() * 6)) + 1;
            System.out.println(i);
        }

    }
}
