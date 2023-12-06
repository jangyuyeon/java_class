package ch07_whlie;

public class Ex08_WhileEx {
    public static void main(String[] args) {
        /**
         * 1+(-2)+3+(-4)+5+(-6)~~~
         * 처럼 계산을 했을 때 합계가 100이 됐을 때의 숫자를 출력
         * 정답 : 199
         */

        int i = 0;
        int sum = 0;

        while(true){
            if (sum != 100) {
                i++;
                if(i % 2 == 0 ){//만약에 아이라는 숫자가 음수, 짝수
                    sum -= i;
                } else{
                    sum += i;
                }
            }else{
                break;
            }
        }
        System.out.println(i);
    }

}
