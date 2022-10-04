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
     * This method tests move are movable or not.
     */
    @Test
    public void testMove(){
        //T,0,0
        boolean expectMove = board.move(0);
        assertThat(expectMove).isTrue();
        //F,0,0
        expectMove = board.move(0);
        assertThat(expectMove).isFalse();
    }

    /**
     * This test method check whether reset() work correctly or not.
     */
    @Test
    public void testReset(){
        //(T,X,X,0)
        board.move(0); //x
        board.move(1); //y
        board.move(2); //x
        board.move(3); //y
        board.move(4); //x
        board.move(7); //y
        board.move(5); //x
        board.move(6); //y
        board.move(8); //x
        board.reset();
        boolean expectGameOver = board.isGameOver();
        assertFalse(expectGameOver);
        Board.State expectTurn = board.getTurn();
        assertThat(expectTurn).isEqualTo(Board.State.X);
        Exception expectWinner =
                assertThrows(IllegalStateException.class, ()->{
                    board.getWinner();
                });
        assertTrue(expectWinner.getMessage().contains("TicTacToe is not over yet."));
        HashSet<Integer> expectAvailableMove = board.getAvailableMoves();
        assertEquals(9,expectAvailableMove.size());

        board = new Board();
        //(F,X,Blank,8)
        board.move(0); //x
        board.move(1); //y
        board.move(2); //x
        board.move(3); //y
        board.move(4); //x
        board.move(7); //y
        board.move(5); //x
        board.move(6); //y
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
