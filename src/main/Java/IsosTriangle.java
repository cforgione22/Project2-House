import java.awt.*;

public class IsosTriangle {

    public static void paint(Point point1, int width, int height, Color color, Graphics g) {
        // IsosTriangle that has a
        // paint method that fills a triangle of a
        // specified color based on a point, base, and height

        Point point2 = new Point(point1.x - (width / 2), point1.y + height);
        Point point3 = new Point(point1.x + (width / 2), point1.y + height);

        Graphics2D g2 = (Graphics2D) g; //casting for enhanced 2D graphics capability
        g2.setColor(color);
        g2.setStroke(new BasicStroke(2));
        g2.drawLine(point1.x, point1.y, point2.x, point2.y);
        g2.drawLine(point2.x, point2.y, point3.x, point3.y);
        g2.drawLine(point3.x, point3.y, point1.x, point1.y);


//
//        private Point topMiddle = new Point(500, 200);
//        private Point upperRight = new Point(700, 5);
//
//
//        Point endPoint = new Point(900, 200);
//        Line lineBottomRoof = new Line(topMiddle, endPoint, Color.BLACK);
//        lineBottomRoof.draw(scene.getGraphics());
//        Point endP = new Point(500, 200);
//        Line lineLeftSideRoof = new Line(upperRight, endPoint, Color.BLACK);
//        lineLeftSideRoof.draw(scene.getGraphics());

    }


}
