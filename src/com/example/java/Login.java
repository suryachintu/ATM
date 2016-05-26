package com.example.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by surya on 26-05-2016.
 */
public class Login extends JFrame implements ActionListener {

    JLabel l1,l2;
    User mUser = new User();
    Sign_up sp = new Sign_up();
    JTextField t1;
    JPasswordField t2;
    JButton b;
    JPanel p;
    Login(){

    }
    Login(User ur, Sign_up sign_up){
        sp = sign_up;
        l1 = new JLabel("User_Name  : ");
        l2 = new JLabel("PIN : ");
        t1 = new JTextField(10);
        t2 = new JPasswordField(8);
        b = new JButton("Login");
        p = new JPanel();
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(b);
        mUser = ur;
        p.setBackground(new Color(34,49,63));
        l1.setForeground(new Color(228,251,254));
        l2.setForeground(new Color(228,251,254));
        b.setBackground(new Color(228,251,254));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        b.addActionListener(this);
        getContentPane().add(p);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (sp!=null)
        sp.setVisible(false);
        if (mUser.user_name.equals(t1.getText()) && mUser.pin == Integer.parseInt(t2.getText())){
            Operate ac = new Operate(mUser,this);
            ac.setVisible(true);
            ac.setSize(500,500);
        }
        else{
            t1.setText("Enter name");
            t2.setText("PIN");
        }
    }
}
