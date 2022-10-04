package ArtificiallntelligenceTest;

import TicTacToe.ArtificialIntelligence.Algorithms;
import TicTacToe.TicTacToe.Board;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlgorithmsTest {
    private Board board;
    @BeforeEach
    public void setup(){
        board = new Board();
    }
    @Test
    public void testRandom(){
        Algorithms.random(board);
        Algorithms.random(board);
        Algorithms.random(board);
        Algorithms.random(board);
        Algorithms.random(board);
        System.out.println(board.toString());

    }
}
