package TicTacToeTest;
import TicTacToe.TicTacToe.Board;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {
    private Board board;
    @BeforeEach
    public void setup(){
        board = new Board();
    }

    /**
     * This test method used for check if the board is null or not.
     */
    @Test
    public void testBoard(){
        //T1(T,3)
        assertThat(board).isNotNull();
        //T2(F,3)
        board = null;
        assertThat(board).isNull();
    }

    /**
     * This test method check whether reset() work correctly or not.
     */
    @Test
    public void testReset(){
        //T1(True,X,Y,0)

        board.move(1); //x
        board.move(0); //y
        board.move(2); //x
        board.move(4); //y
        board.move(3); //x
        board.move(6); //y
        board.move(5); //x
        board.move(8); //y
        System.out.println(board.toString());
//        Boolean isGameOver = board.isGameOver();
//        System.out.println(isGameOver);
//        Exception expectException =
//                assertThrows(IllegalStateException.class, ()->{
//                    board.getWinner();
//                });
//        HashSet<Integer> expectedAvailableMoves = board.getAvailableMoves();
//        Boolean isGameOver = board.isGameOver();
//        Board.State expectedTurn = board.getTurn();
//        assertTrue(expectException.getMessage().contains("TicTacToe is not over yet."));
//        assertThat(expectedAvailableMoves.size()).isEqualTo(9);
//        assertThat(isGameOver).isFalse();
//        assertThat(expectedTurn).isEqualTo(Board.State.X);
    }
}
