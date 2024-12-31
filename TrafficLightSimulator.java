import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TrafficLightSimulator extends JFrame implements ActionListener {
    private JRadioButton redButton, yellowButton, greenButton;
    private JPanel lightPanel;

    public TrafficLightSimulator() {
        // Set up the frame
        setTitle("Traffic Light Simulator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel for lights
        lightPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Draw circles for red, yellow, and green lights
                drawLight(g, Color.RED, 50, redButton.isSelected());
                drawLight(g, Color.YELLOW, 150, yellowButton.isSelected());
                drawLight(g, Color.GREEN, 250, greenButton.isSelected());
            }
        };
        lightPanel.setPreferredSize(new Dimension(200, 300));
        add(lightPanel, BorderLayout.CENTER);

        // Panel for radio buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // Create radio buttons for red, yellow, and green
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        // Add action listeners to radio buttons
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        // Group the radio buttons to allow only one selection at a time
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        // Add radio buttons to the button panel
        buttonPanel.add(redButton);
        buttonPanel.add(yellowButton);
        buttonPanel.add(greenButton);

        // Add the button panel to the frame
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void drawLight(Graphics g, Color color, int y, boolean isOn) {
        g.setColor(isOn ? color : Color.GRAY); // Light is colored if on, otherwise gray
        g.fillOval(100, y, 60, 60); // Draw circle for light
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Repaint light panel when a radio button is selected
        lightPanel.repaint();
    }

    public static void main(String[] args) {
        TrafficLightSimulator simulator = new TrafficLightSimulator();
        simulator.setVisible(true);
    }
}
