package TicTacToeTest;

import TicTacToe.TicTacToe.Board;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class BoardTest {
    private Board board;
    @Test
    public void boardValid(){
        board = new Board();
        assertThat(board).isNull();
    }
}
