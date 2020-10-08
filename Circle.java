package Lab8;

import java.awt.*;

public class Circle extends Shape{

    Circle(Color color, int type, int x, int y) {
        super(color);
        this.type = type;
        this.X = x;
        this.Y = y;
        setOpaque(false);
    }

    public void paintComponent(Graphics g) {
        g.setColor(color);
        switch(type) {
            case 3: g.fillOval(X, Y, 90, 90); break;
            case 4: g.fillArc(X,Y,140,110,90,60); break;
        }

    }
}