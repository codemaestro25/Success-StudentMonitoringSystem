package sms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class starter extends JFrame implements ActionListener {

    JButton login;

    starter(){
        setSize(1000,600);

        JLabel l1 = new JLabel("Student Monitoring System");
        l1.setBounds(280,50,500,100);
        l1.setFont(new Font("Tahoma", Font.BOLD, 32));
        add(l1);

         login = new JButton("LOGIN");
        login.setBounds(750,450,150,80);
        login.addActionListener(this);
        add(login);

        setLayout(null);
        setLocationRelativeTo(null);//takes the frame to center
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
            new login();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new starter();
    }
}
