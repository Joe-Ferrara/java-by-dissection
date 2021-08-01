//HelloButton.java
import java.awt.Container;
import javax.swing.*;

class HelloButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloButton");
        Container pane = frame.getContentPane();
        JButton hello = new JButton("hello, world!");
        pane.add(hello);
        frame.pack();
        frame.setVisible(true);
    }
}
