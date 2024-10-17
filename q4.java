import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/* 
<applet code="SmileyApplet" width="300" height="300">
</applet>
*/

public class SmileyApplet extends Applet {

    public void paint(Graphics g) {
        // Set the background color
        setBackground(Color.WHITE);
        
        // Draw face outline (circle)
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200); // x, y, width, height

        // Draw eyes
        g.setColor(Color.BLACK);
        g.fillOval(90, 100, 30, 30);  // Left eye
        g.fillOval(180, 100, 30, 30); // Right eye

        // Draw mouth (arc)
        g.drawArc(100, 150, 100, 50, 0, -180); // x, y, width, height, startAngle, arcAngle

        // Draw smile (optional line for clarity)
        g.drawLine(100, 175, 200, 175);
    }
}
