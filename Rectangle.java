package Lab8;

import java.awt.*;

public class Rectangle extends Shape{


    Rectangle(Color color, int type, int x, int y) {
        super(color);
        this.type = type;
        this.X = x;
        this.Y = y;
        setOpaque(false);
    }

    public void paintComponent(Graphics g) {
        g.setColor(color);
        switch (type) {
            case 0: g.fillRect(X, Y, 130, 80); break;
            case 1: g.fillRoundRect(X, Y,130, 80, 35, 35); break;
            case 2: g.fillRect(X, Y, 130, 130); break;
        }
    }
}
