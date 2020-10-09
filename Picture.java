package Lab8;

import javax.swing.*;
import java.awt.*;

public class Picture extends JPanel {
    Image image;

    Picture(String path) {
        JFrame frame = new JFrame("LAB8");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        image = new ImageIcon(path).getImage();
        frame.add(this);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
    }

    public static void main(String[] args) {
        String path = args[0];
        Picture ch1 = new Picture(path);
    }
}