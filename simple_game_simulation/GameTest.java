//GameTest.java
import java.awt.*;
import javax.swing.*;

class GameTest {
    public static void main(String[] args)
    {
        GameBoard.State[][] state = new GameBoard.State[20][20];
        for (int row = 0; row < state.length; row++) {
            for (int col = 0; col < state[row].length; col++) {
                state[row][col] = GameBoard.State.state0;
            }
        }

        JFrame frame = new JFrame("GameTest");
        Container pane = frame.getContentPane();
        GameBoard board = new GameBoard(400, 400, state);
        GameEventHandler actor = new GameEventHandler();
        board.addMouseListener(actor);
        pane.add(board, BorderLayout.CENTER);
        JButton quit = new JButton("Quit");
        quit.addActionListener(actor);
        pane.add(quit, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
    }
}

