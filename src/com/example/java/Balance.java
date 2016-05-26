package com.example.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by surya on 26-05-2016.
 */
public class Balance extends JFrame implements ActionListener{
    User bU = new User();
    JTextField t1;
    JButton b;
    JTextField t2;
    JPanel p;
    public Balance(User mU) {
        bU = mU;
        b = new JButton("WITHDRAW");
        t1 = new JTextField("Enter the amount");
        p = new JPanel();
        p.add(t1);
        p.add(b);
        getContentPane().add(p);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
