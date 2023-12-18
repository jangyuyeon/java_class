package ch11_classes.ex4;

import java.util.ArrayList;
import java.util.List;

public class Bookespository {
    // 도서 정보를 관리하는 bookDTOList
    private static List<BookDTO> bookDTOList = new ArrayList<>();

    /**
     * 도서등록 메서드
     * name: save
     * 실행내용
     * Service로 부터 전달 받은 DTO 객체를 리스트에 저장하고 결과를 리턴
     */

    public boolean save(BookDTO bookDTO) {
        return bookDTOList.add(bookDTO);
    }


}
