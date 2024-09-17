import java.awt.*;
public class Window {
    public static void paint(Point point1, Point point2, Color color, Graphics g)
    {
        Box box = new Box(point1, point2, color);

        Point vPoint1 = new Point((point1.x + Math.abs(point2.x - point1.x) / 2), point1.y);
        Point vPoint2 = new Point((point1.x + Math.abs(point2.x - point1.x) / 2), point2.y);

        Line vLine = new Line(vPoint1, vPoint2, color);
        vLine.paint(g);

        Point hPoint1 = new Point(point1.x, (point1.y + Math.abs(point2.y - point1.y) / 2));
        Point hPoint2 = new Point(point2.x, (point1.y + Math.abs(point2.y - point1.y) / 2));

        Line hLine = new Line(hPoint1, hPoint2, color);
        hLine.paint(g);

        box.paint(g);
    }

    public static void paintRoundWindow(Point point1, Point point2, Color color, Graphics g)
    {
        Oval oval = new Oval(point1, point2, color);
        oval.paint(g);

        Point vPoint1 = new Point((point1.x + Math.abs(point2.x - point1.x) / 2), point1.y);
        Point vPoint2 = new Point((point1.x + Math.abs(point2.x - point1.x) / 2), point2.y);

        Line vLine = new Line(vPoint1, vPoint2, color);
        vLine.paint(g);

        Point hPoint1 = new Point(point1.x, (point1.y + Math.abs(point2.y - point1.y) / 2));
        Point hPoint2 = new Point(point2.x, (point1.y + Math.abs(point2.y - point1.y) / 2));

        Line hLine = new Line(hPoint1, hPoint2, color);
        hLine.paint(g);
    }
}





