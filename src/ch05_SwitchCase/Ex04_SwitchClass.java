package ch05_SwitchCase;

public class Ex04_SwitchClass {
    public static void main(String[] args) {
        /*
         *Switch case를 이용한 간단한 사전
         * 이 사전에는 딱 4개의 단어만 들어 있다.
         * desk(책상),chair(의자),monitor(모니터), mouse(마우스)
         *
         * 프로그램을 실행하면 영어 단어를 입력 받고 위의 네 단어중 하날ㄹ 입력 했을 때 해당 의미를 출력해줌.
         * 사전에 없는 단어를 입력하면 사전에 없는 단어 입니다 라고 출력
         *
         */
        String desk = "책상";
        String chair = "의자";
        String monitor = "모니터";
        String mouse = "마우스";
        switch(monitor) {
            case "desk":
                System.out.println("책상입니다.");
                break;
            case "chair":
                System.out.println("의자입니다.");
                break;
            case "monitor":
                System.out.println("모니터입니다.");
                break;
            case "mouse":
                System.out.println("마우스입니다.");
                break;
            default:
                System.out.println("사전에 없는 단어입니다.");
                break;
        }
    }
}
