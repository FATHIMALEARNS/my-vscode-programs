import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventExample extends JFrame implements MouseListener, MouseMotionListener {
    private JLabel label;

    public MouseEventExample() {
        label = new JLabel("Interact with the frame using the mouse");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER); // Ensure the label is added to the center

        addMouseListener(this);
        addMouseMotionListener(this);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered the Frame");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited the Frame");
    }

    // MouseMotionListener methods
    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse Moved to (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseDragged(MouseEvent e) {
        label.setText("Mouse Dragged to (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        new MouseEventExample();
    }
}
