package ch06_For;

public class Ex10_For {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++){//1. 몇단인지를 정해주기

            System.out.println(i + "단" ); //2. 몇단인지 풀력
            for (int j = 1; j <= 9; j++){ // 곱하는 수(1~9)
                System.out.print(i + "x" + j +"="+(i*j));
                System.out.println(("\t"));
            }
                //System.out.println();
                System.out.println("\n");
        }

    }
}
