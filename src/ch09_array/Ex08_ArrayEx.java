package ch09_array;

public class Ex08_ArrayEx {
    public static void main(String[] args) {
        int[] num = {3, 2, 1, 5, 4};
//        위와 같은 배열이 있을 때
//        {1, 2, 3, 4, 5} 와 같이 오름차순 정렬을 하는 코드를 작성 해봅시다.
        int a;

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    a = num[i];
                    num[i] = num[j];
                    num[j] = a;
                }
            }
            System.out.print(num[i]);
        }
        //0번이 고정된 상태에서 1,2,3,4번 비교
        //1번 고정된 상태에서 2,3,4번 비교


    }
//뒤로 갈수록 커지게
}
