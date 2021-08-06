package pizzaRestaurant;

import javax.swing.*;  
import java.awt.event.*;
public class radio implements ActionListener{
    JFrame f;
    JButton b;
    JRadioButton rb1,rb2,rb3,rb4;
    ButtonGroup bg;
    radio(){
    f=new JFrame("Customer Satisfaction");
    rb1=new JRadioButton("Excellent");
    rb1.setBounds(50, 100, 280,80);
    rb2=new JRadioButton("VeryGood");
    rb2.setBounds(50, 200, 280,80);
    rb3=new JRadioButton("Average");
    rb3.setBounds(50, 300, 280,80);
    rb4=new JRadioButton("Poor");
    rb4.setBounds(50, 400, 280,80);
    bg=new ButtonGroup();
    bg.add(rb1);
    bg.add(rb2);
    bg.add(rb3);
    bg.add(rb4);
    b=new JButton("Vote");
    b.setBounds(50, 550,100,100);
    b.addActionListener(this);
    JLabel lb=new JLabel("Vote Now!!!");
    lb.setBounds(50, 650,100,100);
    f.setSize(1000,1000);
    f.add(rb1);
    f.add(rb2);
    f.add(rb3);
    f.add(rb4);
    f.add(b);
    f.add(lb);
    f.setLayout(null);
    f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(rb1.isSelected())
        {
            JOptionPane.showMessageDialog(f,"You voted for "+rb1.getText());
        }   
        else if(rb2.isSelected())
        {
            JOptionPane.showMessageDialog(f,"You voted for "+rb2.getText());
        }
        else if(rb3.isSelected())
        {
            JOptionPane.showMessageDialog(f,"You voted for "+rb3.getText());
        }
        else if(rb4.isSelected())
        {
            JOptionPane.showMessageDialog(f,"You voted for "+rb4.getText());
        }
    }
    
}