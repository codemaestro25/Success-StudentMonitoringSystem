package sms;
import javax.swing.*;
import java.awt.*;
public class login extends JFrame {
    login(){
        setSize(600,400);

        JLabel l1 = new JLabel("Username");
        l1.setBounds(60,80,150,50);
        l1.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(l1);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(60,160, 150,50);
        l2.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(l2);

        JTextField username = new JTextField();
        username.setBounds(250, 80, 150,40);
        username.setFont(new Font("Segeo", Font.PLAIN, 24));
        add(username);

        JPasswordField password = new JPasswordField();
        password.setBounds(250,160, 150,40);
        add(password);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new login();
    }
}
