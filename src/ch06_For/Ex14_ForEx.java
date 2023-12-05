package ch06_For;

public class Ex14_ForEx {
    public static void main(String[] args) {
        /*
        1부터 10까지의 합계 출력
         */
        int sum = 0;
        for(int i=1; i<=10; i++) {
//           sum = 10;
//           sum = sum + i;
           sum += i;
        }
        System.out.println("sum= " + sum);
    }
}
