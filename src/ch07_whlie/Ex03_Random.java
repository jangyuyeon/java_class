package ch07_whlie;

public class Ex03_Random {
    public static void main(String[] args) {
        //Random 매서드 : 지정한 범위내에서 숫자를 무작위로 발생시킴
        //1~10사이의 정수
        // (int) (Math.random() * 10) + 1

        //Math 클래스의 random() 매서드
        // 매서드: 어떤 출력(리턴타입) => double (0.0 ~ 1.0)
        System.out.println(Math.random());
        // 매서드: 어떤 출력(리턴타입) => double (0.0 ~ 10)
        System.out.println(Math.random() * 10);
        // 매서드: 어떤 출력(리턴타입) => double (0.0 ~ 45)
        System.out.println(Math.random() * 45);
        //실수(double) =>정수(int) : 형변환(type conversion)
        System.out.println((int)(Math.random() * 10));//0이상 9이하의 정수
        System.out.println((int)(Math.random() * 10) + 1);//0이상 10이하의 정수
        System.out.println((int)(Math.random() * 45) + 1);//0이상 45이하의 정수

        //형변환
        int int1 = 10;
        double double1 = 1.2345678;

        //정수형 변수를 실수형 변수에 대입(int는 10평 double은 20평이다. 그래서 문제가 없다)
        double double2 = int1;
        System.out.println("double2 = " + double2);

        //실수형 변수를 정수형 변수에 대입(강제형변환)그러나 double에서 int로 변환은 문제가 생긴다.
        int int2 = (int)double1;
        System.out.println("int1");
    }
}
