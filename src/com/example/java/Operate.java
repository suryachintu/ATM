package com.example.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by surya on 26-05-2016.
 */
public class Operate extends JFrame {

    User mU = new User();
    Login lg = new Login();
    Detail bal;
    JButton b1,b2,b3,b4,b5;
    JPanel p;
    Operate(){}
    public Operate(User mUser, Login login) {
        mU = mUser;
        lg = login;
        final Operate op = this;
        b1= new JButton("WITHDRAW");
        b2= new JButton("DEPOSIT");
        b3= new JButton("CHANGE_PIN");
        b4= new JButton("INFO");
        b5 = new JButton("Logout");
        p = new JPanel();
        if (lg!=null)
        lg.setVisible(false);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login nlg = new Login(mU,null);
                op.setVisible(false);
                nlg.setVisible(true);
                nlg.setSize(500,500);

            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bal = new Detail(mU,op,"WITHDRAW");
                bal.setVisible(true);
                bal.setSize(500,500);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bal = new Detail(mU,op,"DEPOSIT");
                bal.setVisible(true);
                bal.setSize(500,500);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              bal = new Detail(mU,op,"CHANGE_PIN");
                bal.setVisible(true);
                bal.setSize(500,500);
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bal = new Detail(mU,op,"INFO");
                bal.setVisible(true);
                bal.setSize(500,500);
            }
        });
        getContentPane().add(p);
    }
}
