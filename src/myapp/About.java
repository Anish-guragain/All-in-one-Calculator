
package myapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class About extends JFrame implements KeyListener, ActionListener {
    
    JPanel panel2 = new JPanel();
    JLabel label = new JLabel();
	JLabel label2 = new JLabel();
         JLabel labe3 = new JLabel();
	JLabel label4= new JLabel();
    
    
    //Constructor
    About() {
        
        super("About");
        label.setText("About the Application");
		label2.setText("The porpose of this application is to have diffrent features of calculation. Where you can calculate BMI,time and Discount");
                 labe3.setText("Developer");
                  label4.setText("Anish Guragain");
                label.setBounds(250, 10, 1000, 50);
		label2.setBounds(0,40,  1000,  50);
                      labe3.setBounds(260, 80, 1000, 50);
		label4.setBounds(250,100,  1000,  50);
                
                
                panel2.add(label);
		panel2.add(label2);
                panel2.add(labe3);
		panel2.add(label4);
      
        
panel2.setBackground(new Color(179, 204, 204));

setSize(700, 300);
setLocation(500, 280);

getContentPane().add(panel2);
panel2.setLayout(null);
		


    }
    
        @Override
    public void actionPerformed(ActionEvent ae) {
    }
      @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }
    
}
