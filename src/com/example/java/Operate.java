package com.example.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by surya on 26-05-2016.
 */
public class Operate extends JFrame implements ActionListener {

    User mU = new User();
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JPanel p;
    public Operate(User mUser) {
        mU = mUser;
        b1= new JButton("WITHDRAW");
        b2= new JButton("DEPOSIT");
        b3= new JButton("CHANGE PIN");
        b4= new JButton("INFO");
        p = new JPanel();
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        getContentPane().add(p);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (b1.getText().toString().equals("WITHDRAW")){
            Balance bl = new Balance(mU);
            p.setVisible(false);
            b1.setVisible(true);
            b1.setSize(500,500);
        }
        else if (b1.getText().toString().equals("DEPOSIT")){
            Balance bl = new Balance(mU);
            p.setVisible(false);
            b1.setVisible(true);
            b1.setSize(500,500);
        }
        else if (b1.getText().toString().equals("CHANGE PIN")){

        }
        else if (b1.getText().toString().equals("INFO")){

        }
    }
}
