import javax.swing.*;
import java.awt.*;

public class Layouts {
    
    
    
        public static void main(String[] args) {
            JFrame frame = new JFrame("Layout Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
    
            frame.add(new JButton("North"), BorderLayout.NORTH);
            frame.add(new JButton("South"), BorderLayout.SOUTH);
            frame.add(new JButton("East"), BorderLayout.EAST);
            frame.add(new JButton("West"), BorderLayout.WEST);
            frame.add(new JButton("Center"), BorderLayout.CENTER);
    
            frame.setSize(400, 200);
            frame.setVisible(true);
        }

     
}
