package ch11_classes;

import ch11_array.ex2.Student;

public class StudentService {
    StudentRepository studentRepository = new StudentRepository();
    /**
     * method name: method1
     * parameter: x
     * return:x
     */
    public void method1(){
        System.out.println("StudentService.method1");
    //Repository 의 method1을 호출
        studentRepository.method();
    }
    public void method2(){
        System.out.println("StudentService.method1");
        String str1 = "집에 가고 싶다";
        StudentRepository.method2(str1);
    }
    public void method3(){
        System.out.println("StudentService.method1");
    }
}
