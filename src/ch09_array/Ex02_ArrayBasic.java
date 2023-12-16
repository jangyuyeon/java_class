package ch09_array;

public class Ex02_ArrayBasic {
    public static void main(String[] args) {
        int[] numbers1 = {10, 20, 30, 40, 50};
        int sum = 0;
        int avg = 0;
        int count = 0;
        // 배열 데이터 출력
        System.out.println("numbers1[0] = " + numbers1[0]);
        System.out.println("numbers1[1] = " + numbers1[1]);
        System.out.println("numbers1[2] = " + numbers1[2]);
        System.out.println("numbers1[3] = " + numbers1[3]);
        System.out.println("numbers1[4] = " + numbers1[4]);

        //for문을 이용해서 배열 데이터 출력
        for(int i = 0; i < numbers1.length; i++){//numbers1.length 앞에 <=는 금지
            System.out.println("numbers1 = "+ numbers1[i]);

        }
        
        //number1에 저장된 모든 데이터의 총합,평균 계산
        for(int i = 0; i < numbers1.length; i++){
            sum += numbers1[i];
            System.out.println(sum);
            avg = sum / numbers1.length ;
            System.out.println(avg);

        }
        }
        }




