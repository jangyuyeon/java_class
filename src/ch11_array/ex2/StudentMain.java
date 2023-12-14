package ch11_array.ex2;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        //Studnent 클래스 개게를 담기 위한 List
        //studentList

        List<Student> studentList = new ArrayList<>();
        //student 클래스에 studentList를 담겠다.
        //studentList.add(12);//숫자는 안되요.

        String studentName = "학생1";
        //studentList.add(studentName);// x
        //Student객체
        Student student1 = new Student(1L, "학생1", "20060220", "산업경영공학", "010-1004-1004");//Long타입의 변수를 사용하고 싶으면 뒤에 대문자 L붙이기.
        //StudentList추가
        studentList.add(student1);

        Student student2 = new Student(2L, "학생2", "20231103", "광고홍보학과", "010-8989-8989");
        studentList.add(student2);

        System.out.println("studentList = " + studentList.get(0));
        System.out.println("studentList = " + studentList.get(1));

        Student a = studentList.get(0);
        System.out.println("a = " + a);
        System.out.println(a.getStudentName());

        //1번 인덱스에 담긴 객체의 학과만 출력
        //studentList에 접근하고 1학생에 접근하고 1학생의 전공 정보를 get 하기
        System.out.println(studentList.get(1).getStudentMajor());

        //반복문
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("studentList = " + studentList.get(i));
            //학생의 이름만 따로 출력
            System.out.println("studentList = " + studentList.get(i).getStudentName());
        }
        //for each
        for (Student stu : studentList) {
            System.out.println("stu = " + stu);
            //이름만
            System.out.println("stu.getStudentName()= " + stu.getStudentName());
        }
    }
}
