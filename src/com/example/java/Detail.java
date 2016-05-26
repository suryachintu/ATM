package com.example.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by surya on 26-05-2016.
 */
public class Detail extends JFrame implements ActionListener{
    User bU = new User();
    Operate op = new Operate(),nop;
    JTextField t1;
    JButton b,b2;
    Detail dt ;
    JLabel l1,l2,l3,l4;
    JTextField t2;
    JPanel p;
    public Detail(final User mU, Operate operate, String withdraw) {
        bU = mU;
        dt = this;
        op = operate;
        op.setVisible(false);
        if (withdraw.equals("WITHDRAW") || withdraw.equals("DEPOSIT")) {
            b = new JButton(withdraw);
            t1 = new JTextField("Enter the amount");
        }
        else if (withdraw.equals("CHANGE_PIN")) {
            t1 = new JTextField("Enter old pin");
            t2 = new JTextField("Enter new pin");
            b = new JButton(withdraw);
        }
        else {
            l1 = new JLabel("UserName : " + mU.user_name);
            l2 = new JLabel("Password : " + String.valueOf(mU.pin));
            l3 = new JLabel("Balance" + String.valueOf(mU.balance));
            //l4 = new JLabel(String.valueOf(mU.password));
        }
        b2 = new JButton("Logout");
        dt = this;
        p = new JPanel();
        if (t1!=null)
        p.add(t1);
        if (t2!=null)
        p.add(t2);
        if (l1!=null)
            p.add(l1);
        if (l2!=null)
            p.add(l2);
        if (l3!=null)
            p.add(l3);
        if (b!=null){
        p.add(b);
        b.addActionListener(this);
        }
        p.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login nlg = new Login(bU,null);
                dt.setVisible(false);
                nlg.setVisible(true);
                nlg.setSize(500,500);
            }
        });
        getContentPane().add(p);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (b.getText().equals("WITHDRAW")){
            if (bU.balance<Double.parseDouble(t1.getText())) {
                JOptionPane.showMessageDialog(null,"Insufficient Balance");
            }
            else{
                bU.withdraw(Double.parseDouble(t1.getText()));
                JOptionPane.showMessageDialog(null,"Available Balance is : " + bU.balance);
                nop = new Operate(bU,null);
                dt.setVisible(false);
                nop.setVisible(true);
                nop.setSize(500,500);
            }
        }
        if (b.getText().equals("DEPOSIT")){
                bU.deposit(Double.parseDouble(t1.getText()));
                JOptionPane.showMessageDialog(null,"Available Balance is : " + bU.balance);
                nop = new Operate(bU,null);
                dt.setVisible(false);
                nop.setVisible(true);
                nop.setSize(500,500);
        }
        if (b.getText().equals("CHANGE_PIN")){
            if (bU.pin == Integer.parseInt(t1.getText())) {
                bU.pin = Integer.parseInt(t2.getText());
                JOptionPane.showMessageDialog(null,"Pin Successfully Changed");
                nop = new Operate(bU,null);
                dt.setVisible(false);
                nop.setVisible(true);
                nop.setSize(500,500);
            }
            else
                JOptionPane.showMessageDialog(null,"Wrong Old Pin");
        }
    }
}
