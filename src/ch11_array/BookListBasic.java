package ch11_array;

import java.util.ArrayList;
import java.util.List;

public class BookListBasic {
    public static void main(String[] args) {
        //정수를 담는 intList 선언
        List<Integer> intList = new ArrayList<>();

        //intList 10 정수를 담을 수 있다.
        intList.add(10);
        System.out.println("intList.size() = " + intList.size());
        intList.add(10000);
        //1번 인덱스에 999를 추가
        intList.add(1, 999);
        System.out.println("intList.size() = " + intList.size());
        //0번 인덱스에 담긴 데이터를 출력
        System.out.println("intList.get(0) = " + intList.get(0));
        System.out.println("intList.get(1) = " + intList.get(1));
        System.out.println("intList.get(2) = " + intList.get(2));
//remove()
        intList.remove(1);
        System.out.println("intList.get(0) = " + intList.get(0));
        System.out.println("intList.get(1) = " + intList.get(1));
        // System.out.println("intList.get(2) = " + intList.get(2));

        //String을 담는 strList선언
        List<String> strList = new ArrayList<>();
        strList.add("안녕");
        strList.add(1, "hellow");
        System.out.println("strList.get(0)) = " + strList.get(0));
        System.out.println("strList.get(1)) = " + strList.get(1));
        String str1 = strList.get(1);
        System.out.println("str1 = " + str1);

        //for문을 이용하여 intList에 담긴 데이터를 모두 출력
        for (int i = 0; i < intList.size(); i++) {
            System.out.println("intList.get(0) = " + intList.get(i));
        }

        //for each
        for (Integer a : intList) { //intlst에 담아져 있는 타입을 Integer에 담고 a는 아무변수 이름
            System.out.println("a = " + a);
        }

        intList.forEach(a -> {
            System.out.println("a = " + a);
        });// 요즘 스타일인데 나중에 알아보자

        //for문을 이용하여 strList에 담긴 데이터를 모두 출력
        for (int i = 0; i < strList.size(); i++) {
            System.out.println("strList.get(0)) = " + strList.get(i));
        }

        //for each
        for (String bb : strList) {
            System.out.println("bb= " + bb);
        }
    }
}
