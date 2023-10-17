package sms;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class viewMarks extends JFrame {
    JTabbedPane tabs;
    JScrollPane sp1, sp2;
    JTable sem1, sem2;
    JButton addMarks;


    viewMarks(){
        setSize(1000,700);

        tabs = new JTabbedPane();
        tabs.setBounds(400,100,550,400);
        tabs.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(tabs);

        sem1 = new JTable();
        sem2 = new JTable();

        sp1 = new JScrollPane();
        sp1.setViewportView(sem1);

        sp2 = new JScrollPane();
        sp2.setViewportView(sem2);

        getDetails();

        tabs.addTab("SEM 1", sp1);
        tabs.addTab("SEM 2", sp2);

        addMarks = new JButton("Add/Update");
        addMarks.setBounds(60,120,150,50);
        add(addMarks);




        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void getDetails(){
        conn c = new conn();

//        sem1 marks fetching code
        String query1 = "select gr , name , english , maths , science from stud_details;";
        try{
           ResultSet rs1 = c.s.executeQuery(query1);
           sem1.setModel(DbUtils.resultSetToTableModel(rs1));
        }catch (Exception e){
            System.out.println(e);
        }

//        sem 2 marks fetching code
        String query2 = "select gr , name, marathi , history, geography from stud_details;";
        try{
            ResultSet rs2 = c.s.executeQuery(query2);
            sem2.setModel(DbUtils.resultSetToTableModel(rs2));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        new viewMarks();
    }
}
