package ch11_classes.ex3;

import ch10_class.ex11.Member;
import ch11_classes.ex2.BookService;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        MemberService memberService = new MemberService();

        Member member = null;

        while (run) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.목록조회 | 4. ");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                memberService.save();
            } else if (selectNo == 2) {
                memberService.findAll();
            } else if (selectNo == 3) {
                memberService.findById();
            } else if (selectNo == 4) {

            }
        }
    }
}
