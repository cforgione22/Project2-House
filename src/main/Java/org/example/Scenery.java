package org.example;

import java.awt.*;

public class Scenery {

    public static void paint(Graphics g) {

        Point groundP1 = new Point(0, 600);
        Point groundP2 = new Point(1500, 600);

        Point leftTreePointTop = new Point(300, 390);
        Point leftTreePointMiddle1 = new Point(300, 420);
        Point leftTreePointMiddle2 = new Point(300, 450);
        Point leftTreePointBottom = new Point(300, 470);

        Point rightTreePointTop = new Point(1100, 390);
        Point rightTreePointMiddle1 = new Point(1100, 420);
        Point rightTreePointMiddle2 = new Point(1100, 450);
        Point rightTreePointBottom = new Point(1100, 470);

        Color color = new Color(10, 92, 8, 255);

        Point bottomOfLeftTreeP1 = new Point(280, 550);
        Point bottomOfLeftTreeP2 = new Point(320, 600);

        Point bottomOfRightTreeP1 = new Point(1080, 550);
        Point bottomOfRightTreeP2 = new Point(1120, 600);

        Color BottomOfTreeColor = new Color(74, 43, 6, 255);



//        Sky.paint();
        Ground.paint(groundP1, groundP2, color, g);
        Tree.paint(leftTreePointTop, 120, 80, color, g);
        Tree.paint(leftTreePointMiddle1, 150, 80, color, g);
        Tree.paint(leftTreePointMiddle2, 180, 80, color, g);
        Tree.paint(leftTreePointBottom,200, 80, color, g);

        Tree.paint(rightTreePointTop, 120, 80, color, g);
        Tree.paint(rightTreePointMiddle1, 150, 80, color, g);
        Tree.paint(rightTreePointMiddle2, 180, 80, color, g);
        Tree.paint(rightTreePointBottom,200, 80, color, g);
        Tree.paintBottomOfTree(bottomOfLeftTreeP1, bottomOfLeftTreeP2, BottomOfTreeColor, g);
        Tree.paintBottomOfTree(bottomOfRightTreeP1, bottomOfRightTreeP2, BottomOfTreeColor, g);
    }
}


