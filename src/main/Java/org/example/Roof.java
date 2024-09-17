package org.example;

import java.awt.*;


public class Roof {

    public static void paint(Point point, int width, int height, Color color, Graphics g) {
        IsosTriangle.paint(point, width, height, color, g);
        ;

    }
    public static void paintChimney(Point point1, Point point2, Color color, Graphics g) {
        Line line = new Line(point1, point2, color);
        line.paint(g);

    }

    public static void paintChimneySmoke(Point point1, Point point2, Color color, Graphics g) {
        Oval oval = new Oval(point1, point2, color);
        oval.paint(g);

    }
}
