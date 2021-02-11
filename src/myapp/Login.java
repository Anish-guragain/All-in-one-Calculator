

package myapp;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.GridLayout;

//Database connection
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Login extends JFrame implements KeyListener, ActionListener {

    JButton submit = new JButton("Login");
	JPanel panel = new JPanel();
	JTextField textField = new JTextField(15);
	JPasswordField jPasswordField = new JPasswordField(15);
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
    
        //Database connection
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    
    //Constructer 
    Login() {
        
        super("All In One Calculator");
      //specify a layout manager
        
                panel.setBackground(new Color(204,51,255));
                submit.setBackground(new Color(0,255,204));

		label.setText("Username");
		label2.setText("Password");
		
		setSize(500, 300);
		setLocation(500, 280);
		

		
		//height size and location
		label.setBounds(220, 10, 100, 50);
		label2.setBounds(220,70,  100,  50);
		textField.setBounds(200, 50, 125, 30);
		jPasswordField.setBounds(200, 110, 125, 30);
		submit.setBounds(220, 150, 80, 30);
        
		
		
		panel.add(label);
		panel.add(label2);
		panel.add(submit);
		panel.add(textField);
		panel.add(jPasswordField);
                
                //add panel to content pane
		getContentPane().add(panel);
                
                 submit.addActionListener(this);
                 conn=database.connect();
        
       


       
panel.setLayout(null);
    }
    
   
    @Override
    public void actionPerformed(ActionEvent ae) {
     

        
        if (textField==null && jPasswordField==null) {

           JOptionPane.showMessageDialog(null, "some field are empty");

        } 
        else {
            try{
                pst=conn.prepareStatement("select* from app where user=? and password=? ");
                  pst.setString(1, textField.getText());
                    pst.setString(2,jPasswordField.getText());
                    
                    
                    rs=pst.executeQuery();
                    if(rs.next()){
                        
       //  Jump to next page when Login is clicked.
        NextPage.createAndShowGUI();
      
       
  
                    }
                    else{
                        System.out.println("enter the valid username and password");
            JOptionPane.showMessageDialog(this, "Incorrect login or password", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
            }catch(Exception ex){
               JOptionPane.showMessageDialog(null, ex); 
            }
            
        }
        
               
                
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
