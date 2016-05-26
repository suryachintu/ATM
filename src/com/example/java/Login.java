package com.example.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by surya on 26-05-2016.
 */
public class Login extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4;
    User mUser = new User();
    JTextField t1;
    JPasswordField t2;
    JButton b;
    JPanel p;
    Login(User ur){
        l3 = new JLabel("Login To Continue");
        l1 = new JLabel("User_Name  : ");
        l2 = new JLabel("PIN : ");
        t1 = new JTextField("Enter name ");
        t2 = new JPasswordField("PIN");
        b = new JButton("Login");
        p = new JPanel();
        p.add(l3);
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(b);
        mUser = ur;
        b.addActionListener(this);
        getContentPane().add(p);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (mUser.user_name.equals(t1.getText().toString()) && mUser.pin == Integer.parseInt(t2.getText())){
            Operate ac = new Operate(mUser);
            ac.setVisible(true);
            ac.setSize(500,500);
            p.setVisible(false);
        }
        else{
            t1.setText("Enter name");
            t2.setText("PIN");
        }
    }
}
