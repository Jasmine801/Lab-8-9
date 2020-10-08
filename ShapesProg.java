package Lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class ShapesProg extends JFrame {

    Graphics g;
    final Random random = new Random();
    Container container = getContentPane();

    public void GetShape() {
        JLayeredPane lp = getLayeredPane();
        JPanel panel = new JPanel();

        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(5);
            int a = random.nextInt(255);
            int b = random.nextInt(255);
            int c = random.nextInt(255);
            Color color = new Color(a, b, c);

            int y = 5;
            int x = 105*i;

            if (i > 9) {
                y = 110;
                x = 105*(i%10);
            }

            if (num == 0 || num == 1 || num == 2) {
                Rectangle rectangle = new Rectangle(color, num, 0, 0);
                rectangle.setBounds(x, y, 95, 85);
                lp.add(rectangle, JLayeredPane.PALETTE_LAYER);
            } else {
                Circle circle = new Circle(color, num, 0, 0);
                circle.setBounds(x, y, 120, 120);
                lp.add(circle, JLayeredPane.PALETTE_LAYER);
            }
        }
    }

    public ShapesProg() {
        JFrame frame = new JFrame("Фигуры");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        container.setLayout(new FlowLayout());
        Action action = new SimpleAction();

        JButton button = new JButton(action);
        button.setText("Генерация фигур");
        button.setPreferredSize(new Dimension(300, 70));
        container.add(button);

        setSize(950, 430);
        setVisible(true);
    }

    class SimpleAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            container.remove(button);
            GetShape();

        }
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new ShapesProg();
    }
}
