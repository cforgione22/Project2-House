import java.awt.*;

public class Ground {

    public static void paint(Point p1, Point p2, Color color, Graphics g) {
        Line line = new Line (p1, p2, color);
        line.paint(g);
    }
}


