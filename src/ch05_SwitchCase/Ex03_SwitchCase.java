package ch05_SwitchCase;

public class Ex03_SwitchCase {
    public static void main(String[] args) {
        String city = "인천";
        switch (city) {
            case "서울":
                System.out.println("서울입니다.");
                break;
            case "인천":
                System.out.println("인천입니다.");
                break;
            case "제주":
                System.out.println("제주입니다.");
                break;
            default:
                System.out.println("한국이 아니예요");
                break;
        }

    }
}
