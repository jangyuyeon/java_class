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


        while(true){ //진실인동안
            if (sum != 100) {//만약 sum이 100이랑 같지 않으면
                i++;            //i를 1씩 증가시켜주세요
                if(i % 2 == 0 ){//i를 2로 나누면 나머지가 0 그래서 짝수구하는식
                    sum -= i; //sum에서
                } else{  //그밖에는
                    sum += i;
                }
            }else{
                break;
            }
        }
        System.out.println(i);
    }

}
