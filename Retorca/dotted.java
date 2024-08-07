import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dotted extends JPanel implements ActionListener {

    private final int DOT_SIZE = 20;
    private final int DELAY = 10;
    private int[] x = {50, 100, 150};
    private int[] y = {50, 100, 150};
    private int[] dx = {1, 2, 3};
    private int[] dy = {2, 1, 2};
    private Timer timer;

    public dotted() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.BLACK);
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        for (int i = 0; i < x.length; i++) {
            g.fillOval(x[i], y[i], DOT_SIZE, DOT_SIZE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < x.length; i++) {
            x[i] += dx[i];
            y[i] += dy[i];

            if (x[i] < 0 || x[i] > getWidth() - DOT_SIZE) {
                dx[i] = -dx[i];
            }
            if (y[i] < 0 || y[i] > getHeight() - DOT_SIZE) {
                dy[i] = -dy[i];
            }
        }
        repaint();
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Animated Dots");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new dotted());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
