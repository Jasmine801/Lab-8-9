package Lab8;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class MultiClown extends JPanel {

    int num;
    Image image;

    public MultiClown() {
        JFrame frame = new JFrame("LAB8");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 340);
        frame.add(this);
        frame.setVisible(true);

        image = new ImageIcon("C:\\Users\\emilm\\IdeaProjects\\MainJava\\src\\clown1.png").getImage();
        num = 0;
        Timer timer = new Timer();
        timer.schedule(animation, 0, 120);
    }

    TimerTask animation = new TimerTask() {
        @Override
        public void run() {
            switch (num) {
                case 0:
                    image = new ImageIcon("C:\\Users\\emilm\\IdeaProjects\\MainJava\\src\\Lab8\\clown1.png").getImage();
                    break;

                case 1:
                    image = new ImageIcon("C:\\Users\\emilm\\IdeaProjects\\MainJava\\src\\Lab8\\clown2.png").getImage();
                    break;

                case 2:
                    image = new ImageIcon("C:\\Users\\emilm\\IdeaProjects\\MainJava\\src\\Lab8\\clown3.png").getImage();
                    break;

                case 3:
                    image = new ImageIcon("C:\\Users\\emilm\\IdeaProjects\\MainJava\\src\\Lab8\\clown4.png").getImage();
                    break;

                case 4:
                    image = new ImageIcon("C:\\Users\\emilm\\IdeaProjects\\MainJava\\src\\Lab8\\clown5.png").getImage();
                    break;

                case 5:
                    image = new ImageIcon("C:\\Users\\emilm\\IdeaProjects\\MainJava\\src\\Lab8\\clown6.png").getImage();
                    break;
                default:
                    break;
            }
            num++;
            if (num == 5) num = 0;
            repaint();
        }
    };

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
    }

    public static void main(String[] args) {
        MultiClown obj = new MultiClown();
    }
}
