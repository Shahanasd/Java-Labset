import java.awt.*;
import javax.swing.*;
public class Shapes extends JPanel{
public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.GREEN);
    g.fillOval(20,30,40,40);
    g.setColor(Color.RED);
    g.drawString("Circle", 20, 90);
    g.setColor(Color.PINK);
    g.fillOval(20, 110, 50, 40);
    g.setColor(Color.RED);
    g.drawString("Ellipse", 20, 170);
    g.setColor(Color.BLUE);
    g.fillRect(80, 40, 80, 40);
    g.setColor((Color.RED));
    g.drawString("Rectangle", 80, 40);
    g.setColor(Color.MAGENTA);
    g.fillRect(90, 140, 90, 90);
    g.setColor((Color.RED));
    g.drawString("Square", 90, 240);
}
public static void main(String[] args) {
    JFrame frame=new JFrame("Shapes Display");
    Shapes shapesPanel=new Shapes();
    frame.add(shapesPanel);
    frame.setSize(300,300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
}