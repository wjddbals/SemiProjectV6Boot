package jiho.springboot.semiprojectv6boot.dao;

import jiho.springboot.semiprojectv5.model.Board;

import java.util.List;
import java.util.Map;

public interface BoardDAO {
    List<Board> selectBoard(int stbno);
    List<Board> selectBoard(Map<String, Object> params);
    int countBoard();
    int countBoard(Map<String, Object> params);//순번으로 보다는


    int insertBoard(Board bd);

    Board selectOneBoard(String bno);
}
