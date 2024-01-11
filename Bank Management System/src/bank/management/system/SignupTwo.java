
package bank.management.system;


import java.awt.*;
import javax.swing.*;

import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

    


public class SignupTwo extends JFrame implements ActionListener {
 
    
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eno,eyes;
    JDateChooser dateChooser;
    JComboBox religion,category,salary,educationQualification,occupation;
    String formno;
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
       
        
        
        JLabel additionalDetails = new JLabel("Page 2 : ADDITIONAL Details");
        additionalDetails.setFont(new Font("Raleway" , Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
         JLabel religionLabel = new JLabel("Religion :");
        religionLabel.setFont(new Font("Raleway" , Font.BOLD,22));
        religionLabel.setBounds(100,140,150,30);
        add(religionLabel);
        
        String[] valReligion = {"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(320,140,400,30);
        religion.setBackground(Color.white);
        add(religion);
        
        
        JLabel categoryLabel = new JLabel("Category :");
        categoryLabel.setFont(new Font("Raleway" , Font.BOLD,22));
        categoryLabel.setBounds(100,190,200,30);
        add(categoryLabel);
        
        String valCategory[] = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(valCategory);
        category.setBackground(Color.white);
        category.setBounds(320,190,400,30);
        add(category);
        
        
        JLabel incomeLabel = new JLabel("Income :");
        incomeLabel.setFont(new Font("Raleway" , Font.BOLD,22));
        incomeLabel.setBounds(100,240,100,30);
        add(incomeLabel);
        
        String valSalary[] = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","Uptp 10,00,000"};
        salary = new JComboBox(valSalary);
        salary.setBackground(Color.white);
        salary.setBounds(320,240,400,30);
        add(salary);
        
        JLabel educationLabel = new JLabel("Educational");
        educationLabel.setFont(new Font("Raleway" , Font.BOLD,22));
        educationLabel.setBounds(100,290,150,30);
        add(educationLabel);
      
        JLabel qualificationLabel = new JLabel("Qualification :");
        qualificationLabel.setFont(new Font("Raleway" , Font.BOLD,22));
        qualificationLabel.setBounds(100,315,250,30);
        add(qualificationLabel);
        
        String valQualification[] = {"Non Graduate","Graduate","Post Graduate","Doctrate","Others"};
        educationQualification = new JComboBox(valQualification);
        educationQualification.setBackground(Color.white);
        educationQualification.setBounds(320,315,400,30);
        add(educationQualification);
        
   
        
        JLabel occupationLabel = new JLabel("Occupation :");
        occupationLabel.setFont(new Font("Raleway" , Font.BOLD,22));
        occupationLabel.setBounds(100,390,250,30);
        add(occupationLabel);
        
         String occupationValues[] = {"Salaried","Self employed","Business","Student","Retired","Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBackground(Color.white);
        occupation.setBounds(320,390,400,30);
        add(occupation);
       
        
        
        JLabel panLabel = new JLabel("PAN No. :");
        panLabel.setFont(new Font("Raleway" , Font.BOLD,22));
        panLabel.setBounds(100,440,250,30);
        add(panLabel);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway" , Font.BOLD,14));
        pan.setBounds(320,440,400,30);
        add(pan);
        
        JLabel aadharLabel = new JLabel("Aadhar No. :");
        aadharLabel.setFont(new Font("Raleway" , Font.BOLD,22));
        aadharLabel.setBounds(100,490,250,30);
        add(aadharLabel);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway" , Font.BOLD,14));
        aadhar.setBounds(320,490,400,30);
        add(aadhar);
        
        JLabel seniorLabel = new JLabel("Senior Citizen :");
        seniorLabel.setFont(new Font("Raleway" , Font.BOLD,22));
        seniorLabel.setBounds(100,540,250,30);
        add(seniorLabel);
        
        syes = new JRadioButton("YES");
        syes.setBounds(320,540,60,30);
        syes.setBackground(Color.white);
        add(syes);
        
        sno = new JRadioButton("NO");
        sno.setBounds(450,540,120,30);
        sno.setBackground(Color.white);
        add(sno);
        
        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);
        
        
        JLabel accountLabel = new JLabel("Existing Account :");
        accountLabel.setFont(new Font("Raleway" , Font.BOLD,22));
        accountLabel.setBounds(100,590,250,30);
        add(accountLabel);
        
          
        eyes = new JRadioButton("YES");
        eyes.setBounds(320,590,60,30);
        eyes.setBackground(Color.white);
        add(eyes);
        
        eno = new JRadioButton("NO");
        eno.setBounds(450,590,120,30);
        eno.setBackground(Color.white);
        add(eno);
        
        ButtonGroup egroup = new ButtonGroup();
        egroup.add(eyes);
        egroup.add(eno);
        
        
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(630,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
                
    }
    public void actionPerformed(ActionEvent ae){
        
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)salary.getSelectedItem();
        
        String seducation = (String)educationQualification.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        String seniorcitizen = null;
        
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        }
        else if(sno.isSelected()){
            seniorcitizen = "No";
        }
        
       
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount = "Yes";
        }else if(eno.isSelected()){
            existingaccount = "No";
        }
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        try {
           
                Conn c =  new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+seniorcitizen+"','"+span+"','"+saadhar+"','"+existingaccount+"') ";
                c.s.executeUpdate(query);
                
                //signup 3 object...........
                
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) { 
        new SignupTwo("");
    }
}


