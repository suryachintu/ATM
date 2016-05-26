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
    Sign_up sp = new Sign_up();
    JTextField t1;
    JPasswordField t2;
    JButton b;
    JPanel p;
    Login(){

    }
    Login(User ur, Sign_up sign_up){
        sp = sign_up;
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
