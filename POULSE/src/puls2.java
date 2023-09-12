import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class puls2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JButton Hover Effect Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            JButton button = new JButton("Hover Me");
            button.setFont(new Font("Arial", Font.PLAIN, 16));

            // Add a mouse listener to change the button's background color on hover
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    button.setBackground(Color.BLUE);
                    button.setForeground(Color.WHITE);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button.setBackground(UIManager.getColor("Button.background"));
                    button.setForeground(UIManager.getColor("Button.foreground"));
                }
            });

            frame.add(button);
            frame.setVisible(true);
        });
    }
}