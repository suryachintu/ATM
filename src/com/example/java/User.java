package com.example.java;

import java.util.Scanner;

/**
 * Created by surya on 26-05-2016.
 */
public class User extends ATM {

    public static void main(String[] args) {
        String x,p;
        int y;
        Scanner sc = new Scanner(System.in);
        User ur = new User();
		System.out.println("Complete Sign up Process : ");
		System.out.println("Enter Username : ");
		x = sc.nextLine();
		System.out.println("Enter Pin : ");
		y = sc.nextInt();
		ur.sign_up(x,y);
		System.out.println("Enter Login Details : ");
		System.out.println("Enter Username : ");
		Scanner sk = new Scanner(System.in);
		p=sk.nextLine();
		System.out.println("Enter Pin : ");
		y = sc.nextInt();
		ur.login(p,y);
    }
    public void sign_up(String x,int z){
        user_name = x;
        pin = z;
        balance = 0.00;
    }
    public void login(String x,int y){
        Scanner sc = new Scanner(System.in);
        if (user_name.equals(x)&&pin==y) {
            loop:while(true){
                System.out.println("Enter ur Choice :\n1.Deposit\n2.Withdraw\n3.Change pin\n4.Info\n5.Exit : ");
                int i,k;
                double j;
                i = sc.nextInt();
                switch(i){
                    case 1:System.out.print("Enter the Amount : ");
                        j = sc.nextDouble();
                        deposit(j);
                        break;
                    case 2:System.out.print("Enter the Amount to withdraw : ");
                        j = sc.nextDouble();
                        withdraw(j);
                        break;
                    case 3:System.out.print("Enter the Old Pin : ");
                        k = sc.nextInt();
                        if (k==pin) {
                            System.out.println("Enter new pin : ");
                            k = sc.nextInt();
                            change_pin(k);
                        }
                        break;
                    case 4:info();
                        break;
                    case 5:break loop;
                    default:System.out.println("Wrong Entry");
                }
            }
        }
        else {
            System.out.println("Wrong Credentials");
        }
    }
}
