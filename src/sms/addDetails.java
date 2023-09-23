package sms;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
public class addDetails extends JFrame {

    int x = 80;
    int txtX = 250;
    int txtWidth = 200;
    int txtHeight = 40;

    Font font = new Font("Tahoma", Font.BOLD,20);

    JDateChooser dob ;
    addDetails(){
        setSize(600,900);

        JLabel l1  = new JLabel("Name");
        l1.setBounds(x,70,150,40);
        l1.setFont(font);
        add(l1);
        
        JLabel l2  = new JLabel("Aadhar");
        l2.setBounds(x,130,150,40);
        l2.setFont(font);
        add(l2);
        
        JLabel l3  = new JLabel("D.O.B");
        l3.setBounds(x,190,150,40);
        l3.setFont(font);
        add(l3);
        
        JLabel l4  = new JLabel("Gender");
        l4.setBounds(x,250,150,40);
        l4.setFont(font);
        add(l4);
        
        JLabel l5  = new JLabel("Address");
        l5.setBounds(x,310,150,40);
        l5.setFont(font);
        add(l5);
        
        JLabel l6  = new JLabel("Phone No");
        l6.setBounds(x,370,150,40);
        l6.setFont(font);
        add(l6);
        
        JLabel l7  = new JLabel("Blood Grp");
        l7.setBounds(x,430,150,40);
        l7.setFont(font);
        add(l7);



        JTextField name = new JTextField();
        name.setBounds(txtX, 70,  txtWidth,txtHeight);
        add(name);

        JTextField aadhar = new JTextField();
        aadhar.setBounds(txtX, 130,  txtWidth,txtHeight);
        add(aadhar);

        JTextField address = new JTextField();
        address.setBounds(txtX, 310,  txtWidth,txtHeight);
        add(address);

        JTextField phoneNo = new JTextField();
        phoneNo.setBounds(txtX, 370,  txtWidth,txtHeight);
        add(phoneNo);

//        dob calender

        dob = new JDateChooser();
        dob.setBounds(txtX, 190, txtWidth, txtHeight);
        add(dob);

        ButtonGroup btn = new ButtonGroup();


        JRadioButton male = new JRadioButton("Male");
        male.setBounds(txtX, 250, txtWidth/2, txtHeight);
        btn.add(male);
        add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(txtX+120, 250, txtWidth/2, txtHeight);
        btn.add(female);
        add(female);

        String [] arr = {"A+", "AB+","O+","O-","AB-"};
        JComboBox bldGrp = new JComboBox(arr);
         bldGrp.setBounds(txtX,430, txtWidth,txtHeight );
         add(bldGrp);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }



    public static void main(String[] args) {
        new addDetails();
    }
}
