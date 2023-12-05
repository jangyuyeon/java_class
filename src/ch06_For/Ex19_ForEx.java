package ch06_For;

public class Ex19_ForEx {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) { //구구단 몇단인지 출력
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {//곱하는 수(1~9)
                System.out.print(i + "x" + j + "=" + (i * j));
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}
