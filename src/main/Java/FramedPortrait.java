import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class FramedPortrait extends JFrame {

    private static final int FRAME_WIDTH = 2000;
    private static final int FRAME_HEIGHT = 2500;
    private Point bottom = new Point(500, 200);

    private CanvasComponent scene;
    private JPanel panel;


    class MouseListener extends MouseAdapter {
       @Override
        public void mousePressed(MouseEvent e) {

            House.paint(scene.getGraphics());
            Scenery.paint(scene.getGraphics());
        }

    }

    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            JOptionPane.showMessageDialog(null, "Hello key-click");
        }
    }

    public  FramedPortrait() {
        scene = new CanvasComponent();
        MouseAdapter listener = new MouseListener();
        scene.addMouseListener(listener);
        scene.addMouseMotionListener(listener);

        KeyAdapter keyListener = new MyKeyListener();
        scene.addKeyListener(keyListener);
        scene.setFocusable(true);

        JLabel keyGuide = new JLabel();
        keyGuide.setText("Crystal Forgione");
        keyGuide.setFont(new Font("SansSerif", Font.PLAIN, 28));
        keyGuide.setHorizontalAlignment(SwingConstants.RIGHT);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(keyGuide, BorderLayout.NORTH);
        panel.add(scene, BorderLayout.CENTER);

        add(panel);
        setTitle("Project-2: House");

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(bottom);
    }

}

