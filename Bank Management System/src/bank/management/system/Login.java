
package bank.management.system;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;


public class Login extends JFrame{
    Login(){
        
        setTitle("........ATM........");
        
        setLayout(null);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = il.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800, 480);
        setVisible(true);
        setLocation(350,200);
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
