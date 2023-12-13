package ch10_class.ex11;

public class Member {
    /*회원 정보 클래스
    회원정보
    -이메일(memberEmail)
    -비밀번호(memberPassword)
    이름(memberName)
    전화번호(memberMobile)
     */
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberMobile;

    //getter,setter
    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberEmail() {

        return memberEmail;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    //생성자 2가지
    public Member() {

    }

    public Member(String memberEmail, String memberPassword, String memberName, String memberMobile) {
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;
        this.memberName = memberName;
        this.memberMobile = memberMobile;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberEmail='" + memberEmail + '\'' +
                ", memberPassworld=" + memberPassword +
                ", memberName='" + memberName + '\'' +
                ", memberMoblile='" + memberMobile + '\'' +
                '}';
    }

    //로그인 처리 메서드
    // *    name: memberLogin
    // *    parameter: memberEmail, memberPassword
    // *    return type: boolean
    // *    실행내용: 이메일, 비밀번호가 일치하면 true,
    // *              일치하지 않으면 false 리턴
    public boolean memberLogin(String memberEmail, String memberPassword) {
        if (memberEmail.equals(this.memberEmail) && memberPassword.equals(this.memberPassword)) {
            return true;
        } else {
            return false;
        }
    }
}

