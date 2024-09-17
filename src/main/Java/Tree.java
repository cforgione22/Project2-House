import java.awt.*;


public class Tree {

    public static void paint(Point point, int width, int height, Color color, Graphics g)
    {
        IsosTriangle.paint(point, width, height, color, g);



    }

    public static void paintBottomOfTree(Point point1, Point point2, Color color, Graphics g) {
        Box box = new Box(point1, point2, color);
        box.paint(g);
    }


}
