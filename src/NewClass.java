
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NidhiK
 */
public class NewClass extends Applet implements Runnable {
   Color c=Color.RED;
    public void paint(Graphics g){
       for(int i=0;i<10;i++){
        try {c=Color.RED;
            g.setColor(c);
            g.fillOval(10, 10, 100, 100);
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        c=Color.GREEN;
         g.setColor(c);
            g.fillOval(10, 10, 100, 100);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
       c=Color.MAGENTA;
         g.setColor(c);
            g.fillOval(10, 10, 100, 100);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
             c=Color.BLUE;
         g.setColor(c);
            g.fillOval(10, 10, 100, 100);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
             c=Color.gray;
         g.setColor(c);
            g.fillOval(10, 10, 100, 100);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
}
    public void run(){}
    }

    
   


