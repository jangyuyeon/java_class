package ch06_For;

public class Ex13_ForEx {
    public static void main(String[] args) {
        /**
         * 별찍기
         *  출력
         *  *
         *  **
         *  ***
         *  ****
         *  *****
         *
         */
    for(int i = 1; i<=5; i++) {
        for(int j = 1; j <= i; j++){//별그리는 식이 1~i(별을 5대 그려야하니깐)
            System.out.print("*");
        }
        System.out.println("");
    }
    }
}
