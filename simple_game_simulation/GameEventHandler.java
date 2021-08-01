// GameEventHandler.java
import java.awt.event.*;

class GameEventHandler implements MouseListener, ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Goodby!");
        System.exit(0);
    }

    public void mouseClicked(MouseEvent e) {
        GameBoard board = (GameBoard)e.getSource();
        int row = e.getY() / board.getCellHeight();
        int col = e.getX() / board.getCellWidth();
        if (board.getCell(row, col) == GameBoard.State.state0)
            board.setCell(row, col, GameBoard.State.state1);
        else
            board.setCell(row, col, GameBoard.State.state0);
        board.repaint();
    }

    public void mouseEntered(MouseEvent e) {};
    public void mouseExited(MouseEvent e) {};
    public void mousePressed(MouseEvent e) {};
    public void mouseReleased(MouseEvent e) {};
}
