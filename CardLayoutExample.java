import javax.swing.*;
import java.awt.*;

public class CardLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        CardLayout cardLayout = new CardLayout();
        JPanel panel = new JPanel(cardLayout);

        // Create cards
        panel.add(new JButton("Card 1"), "Card1");
        panel.add(new JButton("Card 2"), "Card2");

        // Add panel to frame
        frame.add(panel);

        // Show Card1
        cardLayout.show(panel, "Card1");

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
