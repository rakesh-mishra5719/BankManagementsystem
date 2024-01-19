
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;


public class FastCash extends JFrame implements ActionListener{
    String pinnumber;
    JButton oneHun, fiveHun, oneTho, twoTho,fiveTho,tenTho,back;
    public FastCash(String pinnumber) {
        
        setLayout(null);
        this.pinnumber = pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel text = new JLabel("Select Amount for Withdraw");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        oneHun = new JButton("Rs 100");
        oneHun.setBounds(170,415,150,30);
        oneHun.addActionListener(this);
        image.add(oneHun);
        
        fiveHun = new JButton("Rs 500");
        fiveHun.setBounds(355,415,150,30);
        fiveHun.addActionListener(this);
        image.add(fiveHun);
        
        oneTho = new JButton("Rs 1000");
        oneTho.setBounds(170,450,150,30);
        oneTho.addActionListener(this);
        image.add(oneTho);
        
        twoTho = new JButton("Rs 2000");
        twoTho.setBounds(355,450,150,30);
        twoTho.addActionListener(this);
        image.add(twoTho);
        
        fiveTho = new JButton("Rs 5000");
        fiveTho.setBounds(170,485,150,30);
        fiveTho.addActionListener(this);
        image.add(fiveTho);
        
        tenTho = new JButton("Rs 10000");
        tenTho.setBounds(355,485,150,30);
        tenTho.addActionListener(this);
        image.add(tenTho);
        
        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    public  void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }else {
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn c = new Conn();
            try {
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                int balance = 0;
                while(rs.next()){
                    if(rs.getString("type").equals("deposit")){
                        balance +=  Integer.parseInt(rs.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                        
                    }
                }
                
                if(ae.getSource() != back && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                else{
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdraw','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+ amount + " Debited Successfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
                   
            
        }
        
    }
    
    
    public static void main(String[] args) {
     
        new FastCash("");
        
    }
}
