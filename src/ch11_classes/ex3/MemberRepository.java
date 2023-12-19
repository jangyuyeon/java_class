package ch11_classes.ex3;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private static List<MemberDTO> memberDTOList = new ArrayList<>();

    /**
     * 회원등록 메서드
     * name: save
     * parameter: MemberDTO
     * return: boolean
     * 실행내용
     * Service로 부터 전달 받은 DTO 객체를 리스트에 저장하고 결과를 리턴
     */
    public boolean save(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }

    public MemberDTO login(String memberEmail, String memberPassword) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals((memberDTOList.get(i).getMemberEmail() && memberPassword.equals((memberDTOList.get(i).getMemberPassword())
            {
                memberDTO = memberDTOList.get(i);
            }
        }
        return memberDTO;
    }

    public List<MemberDTO> findAll() {
        return memberDTOList;
    }


    /**
     * 회원조회 메서드
     * name: findById
     * parameter: Long
     * return: BookDTO
     * 실행내용
     * Service로 부터 id를 전달받고 일치하는 결과를 찾아서 '로그인성공',일치하지 않으면'로그인실패'출력
     */
    public MemberDTO findById(Long id) {
        MemberDTO memberDTO = null;

        // foreach
        for (MemberDTO memberDTO1 : memberDTOList) {
            if (id.equals(memberDTO1.getId())) {
                memberDTO = memberDTO1;
            }
        }
        return memberDTO;
    }

    public List<MemberDTO> findAll() {
        return memberDTOList;
    }

    public Boolean update(String loginEmail, String mobile) {
        Boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginEmail.equals((memberDTOList.get(i).getMemberEmail()))){
                memberDTOList.get(i).setMemberMobile(mobile);
                result = true;
            }
        }
        return result;
    }

    public boolean emailCheck(String memberEmail) {
    for(int i = 0; i< memberDTOList.size(); i++){
        if(memberEmail.equals(memberDTOList.get(i).getMemberEmail())){
    }
    }
}
