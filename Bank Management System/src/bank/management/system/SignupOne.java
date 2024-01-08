
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame{
    
    SignupOne(){
        
        setLayout(null);
        
        Random ran = new Random();
        long random  = Math.abs(ran.nextLong() % 9000L + 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM N0. " + random);
        formno.setFont(new Font("Raleway" , Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1 : Personal Details");
        personalDetails.setFont(new Font("Raleway" , Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
         JLabel name = new JLabel("Name :");
        name.setFont(new Font("Raleway" , Font.BOLD,22));
        name.setBounds(100,140,100,30);
        add(name);
        
        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway" , Font.BOLD,14));
        nameTextField.setBounds(320,140,400,30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name :");
        fname.setFont(new Font("Raleway" , Font.BOLD,22));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        JTextField fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway" , Font.BOLD,14));
        fnameTextField.setBounds(320,190,400,30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("DOB :");
        dob.setFont(new Font("Raleway" , Font.BOLD,22));
        dob.setBounds(100,240,100,30);
        add(dob);
        
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(320,240,400,30);
        dateChooser.setForeground(Color.BLACK);
        
        add(dateChooser);
        
        JLabel gender = new JLabel("GENDER :");
        gender.setFont(new Font("Raleway" , Font.BOLD,22));
        gender.setBounds(100,290,150,30);
        add(gender);
        
        JRadioButton male = new JRadioButton("MALE");
        male.setBounds(320,290,60,30);
        male.setBackground(Color.white);
        add(male);
        
        JRadioButton female = new JRadioButton("FEMALE");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("E-MAIL ADDRESS :");
        email.setFont(new Font("Raleway" , Font.BOLD,22));
        email.setBounds(100,340,250,30);
        add(email);
        
        JTextField emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway" , Font.BOLD,14));
        emailTextField.setBounds(320,340,400,30);
        add(emailTextField);
        
        JLabel marital = new JLabel("MARITAL STATUS :");
        marital.setFont(new Font("Raleway" , Font.BOLD,22));
        marital.setBounds(100,390,250,30);
        add(marital);
        
        JRadioButton married = new JRadioButton("MARRIED");
        married.setBounds(320,390,100,30);
        married.setBackground(Color.white);
        add(married);
        
        JRadioButton unmarried = new JRadioButton("UNMARRIED");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        JRadioButton other = new JRadioButton("OTHER");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        
        
        JLabel address = new JLabel("ADDRESS :");
        address.setFont(new Font("Raleway" , Font.BOLD,22));
        address.setBounds(100,440,250,30);
        add(address);
        
        JTextField addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway" , Font.BOLD,14));
        addressTextField.setBounds(320,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("CITY :");
        city.setFont(new Font("Raleway" , Font.BOLD,22));
        city.setBounds(100,490,250,30);
        add(city);
        
         JTextField cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway" , Font.BOLD,14));
        cityTextField.setBounds(320,490,400,30);
        add(cityTextField);
        
        JLabel state = new JLabel("STATE :");
        state.setFont(new Font("Raleway" , Font.BOLD,22));
        state.setBounds(100,540,250,30);
        add(state);
        
        JTextField stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway" , Font.BOLD,14));
        stateTextField.setBounds(320,540,400,30);
        add(stateTextField);
        
        JButton next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(630,660,80,30);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
                
    }
    public static void main(String[] args) {
        new SignupOne();
    }
}
