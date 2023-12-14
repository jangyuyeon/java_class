package ch07_whlie;

public class Ex02_WhileEx {
    public static void main(String[] args) {
        /**
         * while문으로 1부터 10까지의 합계 출력
         * 출력
         * 1+2+3+4+5+6+7+8+9+10=55
         */
        int i = 1, sum = 0;                            //i라는 변수에 정수 값 1 , sum이라는 변수에 정수 값 0
        while (i <= 10) {                              //i가 10과 같거나 작은 동안
            System.out.print(i);                      //i의 값을 출력해주자
            sum += i;                                //i들을 더한것 을 sum에 넣어주자
            if (i < 10) {                           //i가 10보다 작다면
                System.out.print("+");              //"+"출력해주고
            } else
                System.out.print("=");              // 그 밖에 숫자들은 "=" 출력해주자

                i++;                               //i에 1씩 증가시켜준다.
        }
        System.out.println(sum);                  //합계를 출력해주자
    }

}

