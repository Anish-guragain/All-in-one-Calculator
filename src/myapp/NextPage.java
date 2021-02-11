

package myapp;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


class NextPage extends JFrame implements KeyListener, ActionListener {
    
   final static String Health = "BMI";
    final static String Date = "Discount Calculator";
    final static String Time  = "Time Converter";
        final static String About  = "About";


    //GUI for BMI
        JButton submit = new JButton("Calculate");
	JPanel card1 = new JPanel();
	JTextField  Height= new JTextField(15);
	JTextField Weight = new JTextField(15);
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        
        
        //GUI for Discount
         JPanel card2 = new JPanel();
         JButton submit2 = new JButton("CONVERT");
         JTextField  price= new JTextField(15);
	JTextField discount = new JTextField(15);
	JLabel MB1 = new JLabel();
	JLabel MB2 = new JLabel();
        JLabel MB3 = new JLabel();
        JLabel MB4 = new JLabel();
         
         

         //GUI for Time conveter
         JPanel card3 = new JPanel();
         JButton submit3 =new JButton("Convert");
         JTextField min=new JTextField();
         JTextField sec=new JTextField();
         JLabel min1 = new JLabel();
	JLabel min2 = new JLabel();
        JLabel is = new JLabel();
        JPanel card4 = new JPanel();
        JButton About1 =new JButton("About");
         
         
         
         
         
    //add component to the pane
    public void addComponentToPane(Container pane) {
        JTabbedPane tabbedPane = new JTabbedPane();
        
        
        
       //////////  ** CODE FOR BMI**/////////////
       //Location 
       tabbedPane.setBackground(new Color(204,51,255));
        setLocation(900, 280);
		
              card1.setBackground(new Color(51, 204, 204));
        
        //Setting label message
		label.setText("Height");
		label2.setText("Weight:");
                label3.setText("Your BMI is: ");
                label4.setText(".");
                
                
	//x axis, y axis, width, height 
		
		label.setBounds(10, 30, 100, 20);
		label2.setBounds(10,65,  100,  20);
		Height.setBounds(80, 30, 150, 20);
                Weight.setBounds(80, 65, 150, 20);
		submit.setBounds(110, 100, 80, 20);
                label3.setBounds(10,130,  100,  20);
                label4.setBounds(100,130,  500,  20);
        
	//Adding components in panel.
		
		card1.add(label);
		card1.add(label2);
                card1.add(label3);
                card1.add(label4);
		card1.add(submit);
		card1.add(Height);
		card1.add(Weight);
                
                getContentPane().add(card1);
                
                submit.addActionListener(this);
      
                //////////  ** fINISHED CODE FOR BMI**/////////////

                
                /////////////** Discount conveter cODE**///////////////
                
             
                card2.setBackground(new Color(51, 204, 204));
                submit2.setBounds(110, 100, 80, 20);
                
                //Setting label message
		MB1.setText("Orginal Price:");
		MB2.setText("Discount:");
               MB3.setText("Final prrice: ");
                MB4.setText(".");
                
                
                //x axis, y axis, width, height
		
		MB1.setBounds(10, 30, 100, 20);
		MB2.setBounds(10,65,  100,  20);
		price.setBounds(100, 30, 150, 20);
                discount.setBounds(100, 65, 150, 20);
		submit2.setBounds(110, 100, 100, 20);
                MB3.setBounds(10,130,  100,  20);
                MB4.setBounds(100,130,  500,  20);
                
                //Adding components in panel.
		
		card2.add(MB1);
		card2.add(MB2);
                card2.add(MB3);
                card2.add(MB4);
		card2.add(submit2);
		card2.add(price);
		card2.add(discount);
                
                
                card2.add(submit2);
                getContentPane().add(card2);
                
                //Action listiner for when the button is clicked.
                 submit2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
                            
                                double orprice=Double.parseDouble(price.getText());
                double ordiscount=Double.parseDouble(discount.getText());
      
      double dis=(ordiscount/100)*orprice;
      double pr=orprice-dis;
      
      MB4.setText(pr+" ");
                            
			}
		});
                 
                 
               ////////////// DATA CONVERTER CODE FINISHED/////////////  
                 
                 
                 
                 
                 
                 
              
                
                
                /////////////**  TIME CONVERTER CODE START**//////////
                
                
                card3.setBackground(new Color(51, 128, 204));
            submit3.setBounds(110, 100, 80, 20);
            
            
            
              //Setting label message
              min1.setText("Minute");
               min2.setText("Second:");
               sec.setText(".");
              is.setText("is");
               
                //x axis, y axis, width, height
                min.setBounds(80, 30, 50, 20);
		sec.setBounds(230,30, 100,  20);
                submit3.setBounds(160, 100, 100, 20);
                min1.setBounds(150, 30, 150, 20);
                min2.setBounds(340, 30, 150, 20);
                 is.setBounds(200, 30, 50, 20);
                
                
                
                    //Adding components in panel.
		
		card3.add(min);
		card3.add(sec);
                card3.add(min1);
                card3.add(min2);
		card3.add(submit3);
                card3.add(is);
	
                
               
                getContentPane().add(card3);      
                 card4.add(About1);
                 	submit3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				 double time=Double.parseDouble(min.getText());
                                     double s=time*60;
                                        sec.setText(s+"");
      
			}
		});
                 
                 
                 
                   ////////// About Tab CODE/////////
                 
                 getContentPane().add(card4);
                 About1.setBounds(160, 100, 120, 50);
                 
                 
                 
                 
                 
                 
		About1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				About frame1 = new About();
           
                                    frame1.setVisible(true);
			}
		});
                
                
                //////fINSHED ABOUT TAB//////////
                 
                
                 

                tabbedPane.addTab(Health, card1);
                tabbedPane.addTab(Date, card2);
                tabbedPane.addTab(Time, card3);
                tabbedPane.addTab(About, card4);

                pane.add(tabbedPane, BorderLayout.CENTER);
card1.setLayout(null);
card2.setLayout(null);
card3.setLayout(null);
    }

  
    public static void createAndShowGUI() {
      
      

        //Create and set up the window.
        JFrame frame = new JFrame("All in One");
       
        frame.setSize(600, 300);
        frame.setLocation(500, 280);
        
    
		

        //Create and set up the content pane.
        NextPage demo = new NextPage();
        demo.addComponentToPane(frame.getContentPane());
       
        frame.setVisible(true);
    }
          
          
          
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        

        //BMI calculator
        
         double height=Double.parseDouble(Height.getText());
                double weight=Double.parseDouble(Weight.getText());
        
    double bmi =  weight/ (Math.pow(height, 2));
    
      if (bmi < 18.5) {
                     label4.setText(bmi+" "+ "You are underweight Please eat more. ");
                      card1.setBackground(new Color(255, 102, 102));
                 } 
      
      else if (bmi < 25) {
                     label4.setText(bmi+" "+ "You are Healthy");
                      card1.setBackground(new Color(51, 204, 128));
                 } else if (bmi < 30) {
                     label4.setText(bmi+" "+ "You are Overweight Please eat less");
                     card1.setBackground(new Color(255, 102, 102));
                 } else {
                     label4.setText(bmi+" "+  "You are obsedsed you might die. ");
                     card1.setBackground(new Color(255, 26, 26));
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
