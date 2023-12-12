package ch10_class.ex6;

public class MethodExMain {
    public static void main(String[] args) {
        MethodEx methodEx = new MethodEx();
        System.out.println("호출 전");
        //method1호출
        methodEx.method1();
        System.out.println("호출 후");
//method2 호출
        methodEx.method2("안녕하세요");
        String str1 = "오늘은 화요일";
        methodEx.method2(str1);

        //method3 호출
        String result = methodEx.method3();
        System.out.println("result = " + result);
        System.out.println(methodEx.method3());
        
        //method4 호출 후 결과값 출력
    int result1 = methodEx.method4();
        System.out.println("result = " + result);

        //method5 호출 후 결과값 출력
        String result2 = methodEx.method5("안녕",1000);
        System.out.println("result2 = "+result2);


    }
}
