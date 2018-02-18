/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlemoving;

/**
 *
 * @author Arm_AVI
 */
import javax.swing.*;
import java.awt.*;
public class CircleMoving {

    /**
     * @param args the command line arguments
     */
    int x = 70;
    int y = 70;
    
    public static void main(String[] args) {
         CircleMoving gui = new CircleMoving ();
         gui.go();
    }

public void go() {
          JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       MyDrawPanel drawPanel = new MyDrawPanel();       

       frame.getContentPane().add(drawPanel);
       frame.setSize(300,300);
       frame.setVisible(true);


       for (int i = 0; i < 130; i++) {

          x++;
          y++;

          drawPanel.repaint();
  
          try {
            Thread.sleep(50);
          } catch(Exception ex) { }
       }
       
    
   }// close go() metho
    }
    

