import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class myframe extends JFrame implements ActionListener { //class in resturant

    
    JButton meatButton; // declrate the meat button 
    JButton chickenButton; // declrate the chicken  button 
    JButton juiceButton; // declrate the juice button 
    JButton calcButton; // declrate the total button 
    JButton exiButton; 
    JLabel label; // declrate the  label 
    
    
    myframe (){ // constractur
        
     
        JFrame frame = new JFrame(); // make frame the app
        meatButton = new JButton("meat"); // add button (meat)
        chickenButton = new JButton("chicken"); // add button (chicken)
        juiceButton = new JButton("pepsi"); // add button (juice)
        calcButton = new JButton("total"); // add button (total)
       
        JLabel systemJLabel = new JLabel("System order resturant"); // add the text on top the form 
        JLabel meatJLabel = new JLabel("16.0 "); // add label (meat)
        JLabel chickenJLabel = new JLabel("14.0 "); // add label (chicken)
        JLabel juicejJLabel= new JLabel("3.0"); // add label (juice)

        
        systemJLabel.setBounds(250, 0, 150, 25); // size the label on top 
        meatJLabel.setBounds(360, 100, 100, 25); // size meat label 
        chickenJLabel.setBounds(360, 150, 100, 25); // size chicken label 
        juicejJLabel.setBounds(360, 200, 100, 25);// size juice label 
       
     
        meatButton.setBounds(400, 100, 100, 25); // size meat button
        meatButton.addActionListener(this);
        chickenButton.setBounds(400, 150, 100, 25);// size chiecken  button
        chickenButton.addActionListener(this);
        juiceButton.setBounds(400, 200, 100, 25);// size juice button
        juiceButton.addActionListener(this);
        calcButton.setBounds(200, 150, 100, 25);// size total  button
        calcButton.addActionListener(this);


        // setting of the form and add 


        frame.setTitle(" System odrer "); // name is app 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE ); // تفعيل الخروج من البرنامج 
        frame.setResizable(false); // can't change the size of form
        frame.setLayout(null); // add more layout such as (label and button )
        frame.setSize(600,420); // size of form 
        frame.setVisible(true); // show the form

        frame.add(systemJLabel);//add labael on top 
        frame.add(meatJLabel); // meat label 
        frame.add(chickenJLabel);// chicken label 
        frame.add(juicejJLabel);//juice label 
    
        frame.add(meatButton);//meat button 
        frame.add(chickenButton);//chicken button 
        frame.add(calcButton);//total button
        frame.add(juiceButton);// juice button 
    
    
        ImageIcon image = new ImageIcon("casher.png"); // add the image icon of app 
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(255,255,255));

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

    
   
        
    
}   

