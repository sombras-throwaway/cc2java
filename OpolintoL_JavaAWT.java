package cc2;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
/**
 * Opolinto, Leo A.
 * 11/20/2024
 * Java AWT
 * CC2-1B
 */
public class OpolintoL_JavaAWT extends Canvas{
    public void paint(Graphics nik){
        nik.setColor(Color.PINK);
        nik.drawRect(50, 50, 150, 100); // draw rectangle of size 1280x720px at point 50,50
        nik.setColor(Color.BLUE);
        nik.fillRect(250,50,150,100);
        nik.setColor(Color.GREEN);
        nik.drawOval(450,50,100,100);
        nik.setColor(Color.RED);
        nik.fillOval(600,50,100,100);
        nik.setColor(Color.BLACK);
        nik.drawLine(50, 200, 800,200);
        nik.setColor(Color.BLACK);
        nik.drawLine(750, 50, 750,150);
        nik.setColor(Color.BLACK);
        nik.drawLine(800, 50, 800,150);
    }
    public static void main (String[] args){
        Scanner gioScanner = new Scanner(System.in);
        JFrame f = new JFrame("Ch'r'ai Nik'ga the Album");
        OpolintoL_JavaAWT canvas = new OpolintoL_JavaAWT();
        f.setSize(1900, 1020);
        f.add(canvas);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
