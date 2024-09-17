package org.example;

import java.awt.*;

public class HouseFrame {

    public static void paint(Point point1, Point point2, Color color, Graphics g) {
        Box box = new Box(point1, point2, color);
        box.paint(g);

    }

}