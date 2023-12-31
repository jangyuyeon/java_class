package ch11_classes.ex5;

import ch11_classes.ex2.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {

    private static List<BoardDTO> boardDTOList = new ArrayList<>();

    //글 등록 메서드
    public boolean save(BoardDTO boardDTO) {
        return boardDTOList.add(boardDTO);

    }

    //글 조회 메서드
    public List<BoardDTO> findAll() {
        return boardDTOList;
    }

    public boolean updateHits(Long id) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                // 기존 조회수 값을 가져옴
                int hits = boardDTOList.get(i).getBoardHits();
                // 1 증가 시킴
                hits = hits + 1;
                // 조회수 필드에 저장
                boardDTOList.get(i).setBoardHits(hits);
                return true;
            }
        }
        return false;
    }

    public BoardDTO findById(Long id) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                return boardDTOList.get(i);
            }
        }
        return null;
    }

    //글 수정 기능
    public boolean update(Long id, String boardTitle, String boardContents) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                boardDTOList.get(i).setBoardTitle(boardTitle);
                boardDTOList.get(i).setBoardContents(boardContents);
                return true;
            }
        }
        return false;
    }

    //글 삭제 기능
    public boolean delete(Long id) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                boardDTOList.remove(i);
                return true;
            }
        }
        return false;
    }

    //글검색기능
    public List<BoardDTO> search(String q) {
        List<BoardDTO> searchList = new ArrayList<>();
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(q)) {
                searchList.add(boardDTOList.get(i));
            }
        }
        return searchList;
    }

    public BoardDTO findByTitle(String boardTitle) {
    }
}
