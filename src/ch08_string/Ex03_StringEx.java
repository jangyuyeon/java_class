package ch08_string;

import java.util.Scanner;

public class Ex03_StringEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 '종료'를 입력하세요.");

        String world = "";
        boolean run = true;

        while (run) {
            System.out.print(">");
            world = scanner.next();
            System.out.println(world);

            if (world.equals("종료")) {
                run = false;
            }
        }
    }
}
