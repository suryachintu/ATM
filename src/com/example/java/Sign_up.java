package com.example.java;

import javafx.scene.effect.ColorInput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * Created by surya on 26-05-2016.
 */
public class Sign_up extends JFrame implements ActionListener {
    private static Sign_up m;
    JLabel l1,l2,l3;
    JTextField t1;
    JPasswordField t2;
    JButton b;
    JPanel p;
    Sign_up(){
        l1 = new JLabel("User Name : ");
        l2 = new JLabel("PIN : ");
        l3 = new JLabel("");
        t1 = new JTextField(10);
        t2 = new JPasswordField(8);
        b = new JButton("Sign_Up");
        p = new JPanel();
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(l3);
        p.add(b);
        b.addActionListener(this);
        p.setBackground(new Color(34,49,63));
        l1.setForeground(new Color(228,251,254));
        l2.setForeground(new Color(228,251,254));
        l3.setForeground(new Color(228,251,254));
        b.setBackground(new Color(228,251,254));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(p);
    }
    public static void main(String[] args) {
        m = new Sign_up();
        m.setVisible(true);
        m.setSize(500,500);
       // m.setBackground(new Color(34,49,63));
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
