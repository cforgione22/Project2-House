import java.awt.*;

public class House {

    public static void paint(Graphics g) {

        Point roofPoint = new Point(700, 50);

        Point chimneyLeftLinePoint1 = new Point(800, 110);
        Point chimneyLeftLinePoint2 = new Point(800, 150);

        Point chimneyTopLinePoint1 = new Point(800, 110);
        Point chimneyTopLinePoint2 = new Point(850, 110);

        Point chimneyRightLinePoint1 = new Point(850, 110);
        Point chimneyRightLinePoint2 = new Point(850, 200);

        Point smoke1Point1 = new Point(810, 70);
        Point smoke1Point2 = new Point(880, 100);

        Point smoke2Point1 = new Point(850, 40);
        Point smoke2Point2 = new Point(920, 70);

        Point smoke3Point1 = new Point(890, 10);
        Point smoke3Point2 = new Point(960, 40);

        Point houseFramePoint1 = new Point(465, 300);
        Point houseFramePoint2 = new Point(0, 0);

        Point topLeftWindowP1 = new Point(500, 330);
        Point topLeftWindowP2 = new Point(560, 420);

        Point topRightWindowP1 = new Point(840, 330);
        Point topRightWindowP2 = new Point(900, 420);

        Point bottomLeftWindowP1 = new Point(500, 450);
        Point bottomLeftWindowP2 = new Point(600, 550);

        Point bottomRightWindowP1 = new Point(800, 450);
        Point bottomRightWindowP2 = new Point(900, 550);

        Point roundWindowP1 = new Point(660, 320);
        Point roundWindowP2 = new Point(740, 400);

        Point doorP1 = new Point(650, 430);
        Point doorP2 = new Point(750, 260);

        Point doorKnobP1 = new Point(730, 500);
        Point doorKnobP2 = new Point(740, 490);

        Color color = new Color(0, 0 , 255);

        Roof.paint(roofPoint, 500, 250, color, g);

        Roof.paintChimney(chimneyLeftLinePoint1, chimneyLeftLinePoint2, color, g);
        Roof.paintChimney(chimneyTopLinePoint1, chimneyTopLinePoint2, color, g);
        Roof.paintChimney(chimneyRightLinePoint1, chimneyRightLinePoint2, color, g);
        Roof.paintChimneySmoke(smoke1Point1, smoke1Point2, color, g);
        Roof.paintChimneySmoke(smoke2Point1, smoke2Point2, color, g);
        Roof.paintChimneySmoke(smoke3Point1, smoke3Point2, color, g);

        HouseFrame.paint(houseFramePoint1, houseFramePoint2, color, g);

        Window.paint(topLeftWindowP1, topLeftWindowP2, color, g);
        Window.paint(topRightWindowP1, topRightWindowP2, color, g);
        Window.paint(bottomLeftWindowP1, bottomLeftWindowP2, color, g);
        Window.paint(bottomRightWindowP1, bottomRightWindowP2, color, g);
        Window.paintRoundWindow(roundWindowP1, roundWindowP2, color, g);

        Door.paint(doorP1, doorP2, color, g );
        Door.paintDoorKnob(doorKnobP1, doorKnobP2, color, g);
    }
}
