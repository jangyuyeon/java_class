package ch11_classes.ex3;

import ch11_classes.ex2.BookDTO;
import ch11_classes.ex2.BookRepository;

import java.util.List;
import java.util.Scanner;

public class MemberService {
    Scanner scanner = new Scanner(System.in);
    MemberRepository memberRepository = new MemberRepository();

    public void save() {
        System.out.print("이메일: ");
        String memberEmail = scanner.next();
        System.out.print("비밀번호: ");
        String memberPassword = scanner.next();
        System.out.print("이름: ");
        String memberName = scanner.next();
        System.out.print("전화번호: ");
        String memberMobile= scanner.next();
        MemberDTO memberDTO = new MemberDTO(memberEmail,memberPassword,memberName,memberMobile);
        boolean result = memberRepository.save(memberDTO);
        if (result) {
            System.out.println("회원가입 성공");
        } else {
            System.out.println("회원가입 실패");
        }
    }

    /**
     * 회원목록 메서드
     * name: findAll
     * parameter: x
     * return: x
     * 실행내용
     * Repository로 부터 목록을 리턴 받아서 목록에 있는 모든 정보를 출력
     */
    public void findAll() {
        List<MemberDTO> memberDTOList = memberRepository.findAll();
        for (MemberDTO memberDTO : memberDTOList) {
            System.out.println("memberDTO = " + memberDTO);
        }
    }
    /**
     * 회원조회 메서드
     * name: findById
     * parameter: x
     * return: x
     * 실행내용
     * id를 입력받고 Repository로 부터 id에 해당 하는 멤버 정보를 출력
     *
     */
    public void findById() {
        System.out.print("조회 id: ");
        Long id = scanner.nextLong();
        MemberDTO memberDTO = memberRepository.findById(id);
        if (memberDTO != null) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
    }
}
