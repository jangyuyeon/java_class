package ch10_class.ex10;

public class StudentMain {
    public static void main(String[] args) {
        // 기본생성자로 Student클래스 객체 만들기 (객체 선언문)
        Student student = new Student();
        //setter를 이용하여 필드값
        student.setStudentName("유연");
        student.setStudentNumber("9422");
        student.setStudentMajor("광고홍보학과");
        student.setStudentMobile("010-8989-8989");

        // 모든 필드를 매개변수로 하는 생성자로  Student 클래스 객체 만들기
        Student student2 = new Student("동성", "0606", "산업경영공학", "010-1004-1004");

        //각각의 객체에서 print 메서드 호출하여 필드값 출력
        student.print();
        student2.print();

        System.out.print("student = "+ student);
        System.out.print("student2 = "+ student2);

    }


}
