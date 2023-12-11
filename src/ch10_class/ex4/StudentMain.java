package ch10_class.ex4;

public class StudentMain {
    public static void main(String[] args) {
        //기본생성자로 student1객체 생성
     Student student1 = new Student();
        student1. studentName = "학생1";
        student1. studentNumber = "1111111";
        student1. studentMajor = "통계학";
        System.out.println("student1.studentName ="+student1.studentName);

    //매개변수 있는 생성자로 student2 객체 생성
        Student stu = new Student("학생1","11111","010-1234-5678");
        System.out.println("stu.studentName = "+stu.studentName);

    }
}
