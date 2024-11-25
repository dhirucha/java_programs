import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("removal")
public class SimpleApplet extends Applet {
    // Called once when the applet is initialized
    public void init() {
        System.out.println("Applet initialized.");
    }

    // Called to start the applet
    public void start() {
        System.out.println("Applet started.");
    }

    // Called to paint the applet's content
    public void paint(Graphics g) {
        g.drawString("Welcome to Java Applet!", 50, 50); // Display message
        g.drawOval(70, 70, 50, 50);                      // Draw a circle
        g.drawRect(150, 70, 100, 50);                    // Draw a rectangle
    }

    // Called when the applet is stopped
    public void stop() {
        System.out.println("Applet stopped.");
    }

    // Called when the applet is destroyed
    public void destroy() {
        System.out.println("Applet destroyed.");
    }
}
