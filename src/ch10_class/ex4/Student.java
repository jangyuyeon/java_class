package ch10_class.ex4;

public class Student {
    //이름(studentName), 학번(studentNumber), 학과(studentMajor) 필드
    String studentName;
    String studentNumber;
    String studentMajor;

    //기본생성자
    public Student(){
        System.out.println("기본 생성자");
    }

    public Student(String studentName, String studentNumber, String studentMajor){
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMajor = studentMajor;
    }
}
