//GameBoard.java
import java.awt.*;
import javax.swing.*;

class GameBoard extends JComponent {
    // the example supportss only two valid states
    static enum State { state0, state1 }

    public GameBoard(int width, int height, State[][] board) {
        this.board = board;
        setSize(new Dimension(width, height));
    }

    // draw the cells of the board
    protected void paintComponent(Graphics g) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                select_color(g, board[row][col]);
                g.fillRect(col * cellWidth, row * cellHeight, cellWidth, cellHeight);
            }
        }
    }
/* the default update() redraws the entire display using the background color,
 * then calls paint(). To avoid the flicker of background color, we override
 * update(0 to just call paint().
 * This is recommended whenever painComponent() redraws all pixels.
 */
     public void update(Graphics g) {
         paintComponent(g);
     }

     public Dimension getinimumSize() {
         return dim;
     }
     public Dimension getPreferredSize() {
         return getMinimumSize();
     }

     public void setBounds(int x, int y, int width, int height) {
         dim = new Dimension(width, height);
         //adjuct cell size to fill the new board size
         cellWidth = Math.round((float)width / board.length);
         cellHeight = Math.round((float)height / board[0].length);
         super.setBounds(x, y, width, height);
         repaint();
     }

     public void setCell(int row, int col, State value) {
         board[row][col] = value;
     }

     public State getCell(int row, int col) {
         return board[row][col];
     }

     public int getCellWidth() { return cellWidth; }
     public int getCellHeight() { return cellHeight; }

     private void select_color(Graphics g, State cell) {
         if (cell == State.state0)
             g.setColor(Color.white);
         else
             g.setColor(Color.black);
     }

     private State[][] board;
     private int cellWidth, cellHeight;
     private Dimension dim;
 }
                
