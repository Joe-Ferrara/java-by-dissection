//HelloGoodBye.java
import java.awt.Container;
import javax.swing.*;

class HelloGoodBye {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloGoodBye");
        Container pane = frame.getContentPane();
        JButton hello = new JButton("Hello, world!");
        GoodBye listener = new GoodBye();
        hello.addActionListener(listener);
        pane.add(hello);
        frame.pack();
        frame.setVisible(true);
    }
}
