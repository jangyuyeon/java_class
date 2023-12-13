package ch10_class.ex12;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        Board board = null;

        while (run) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.글작성 | 2.글조회 | 3.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {

                System.out.println("글번호: ");
                Long id = scanner.nextLong();
                System.out.println("제목: ");
                String boardTitle = scanner.next();
                System.out.println("작성자: ");
                String boardWriter = scanner.next();
                System.out.println("내용: ");
                String boardContents = scanner.next();
                board = new Board(id, boardTitle, boardWriter,boardContents);

                board.setBoardTitle(boardTitle);
                board.setBoardWriter(boardWriter);
                board.setBoardContents(boardContents);

            } else if (selectNo == 2) {
//         *      글번호를 입력 받고 Board 클래스의 findById로 글번호를 넘긴다.
                System.out.println("글번호를 입력하세요: ");
                Long id = scanner.nextLong();
                board.findById(id);

            }else if (selectNo == 3) {
                run = false;
                }
            }
        }
    }

