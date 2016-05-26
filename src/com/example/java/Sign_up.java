package com.example.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by surya on 26-05-2016.
 */
public class Sign_up extends JFrame implements ActionListener {
    private static Sign_up m;
    JLabel l1,l2,l3,l4;
    JTextField t1;
    JPasswordField t2;
    JButton b;
    JPanel p;
    Sign_up(){
        l4 = new JLabel("Complete Sign Up Process ");
        l1 = new JLabel("User_Name  : ");
        l2 = new JLabel("Password : ");
        l3 = new JLabel("");
        t1 = new JTextField("Enter name ");
        t2 = new JPasswordField("Password");
        b = new JButton("Register");
        p = new JPanel();
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(l3);
        p.add(b);
        p.add(l4);
        b.addActionListener(this);
        getContentPane().add(p);
    }
    public static void main(String[] args) {
        m = new Sign_up();
        m.setVisible(true);
        m.setSize(500,500);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        User ur = new User();
        ur.sign_up(t1.getText(),Integer.parseInt(t2.getText()));
        m.setVisible(false);
        Login lg = new Login(ur,this);
        lg.setVisible(true);
        lg.setSize(500,500);
    }
}
