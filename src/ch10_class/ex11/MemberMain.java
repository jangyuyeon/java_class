package ch10_class.ex11;

import ch10_class.ex10.Student;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        /**
         * 메뉴
         * 1. 회원가입(기본생성자이용)
         * 회원가입 정보는 스캐너로 받음
         * 2.로그인
         * 3.종료
         */
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        Member member = null;


        while (run) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                member = new Member();
                System.out.println("이메일");
                String memberEmail = scanner.next();
                System.out.println("비밀번호");
                String memberPassword = scanner.next();
                System.out.println("이름");
                String memberName = scanner.next();
                System.out.println("전화번호");
                String memberMobile = scanner.next();
                member.setMemberEmail(memberEmail);
                member.setMemberPassword(memberPassword);
                member.setMemberName(memberName);
                member.setMemberMobile(memberMobile);
            } else if (selectNo == 2) {
                

            }

        }
    }
}
