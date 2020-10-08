package Lab8;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {
    protected Color color;
    protected int type, X, Y;

    Shape (Color color) {
        this.color = color;
    }
}
