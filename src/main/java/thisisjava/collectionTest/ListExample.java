package thisisjava.collectionTest;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        BoardDao boardDao = new BoardDao();
        List<Board> list = boardDao.getBoardList();
        for (Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }
    }

    private static class BoardDao {

        public List<Board> getBoardList() {
            List<Board> boardList = new ArrayList<>();
            boardList.add(new Board("제목1", "내용1"));
            boardList.add(new Board("제목2", "내용2"));
            boardList.add(new Board("제목3", "내용3"));

            return boardList;
        }

    }

    private static class Board {
        private String title;
        private String content;

        public Board(String title, String content) {
            this.title = title;
            this.content = content;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }
    }

}
