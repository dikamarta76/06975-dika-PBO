/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
import view.Daftar;


public class GUI {
    JFrame Login = new JFrame();
    JLabel  top;
    JButton daftar, login;
    
    public GUI (){
    Login.setSize(700,630);
    Login.setLayout(null);
    top = new JLabel ("SISTEM KAMPUS");
    top.setBounds(175,50,600,50);
    top.setFont(new Font("Times New Roman", Font.BOLD,40));
    Login.add(top);
    
    daftar = new JButton("Daftar");
    daftar.setBounds(120,320,100,40);
    Login.add(daftar);
    
    login = new JButton("Login");
    login.setBounds(400,320,100,40);
    Login.add(login);
    
        Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Login.setVisible(true);
        Login.setLocationRelativeTo(null);
    
    daftar.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
            view.Daftar daftar = new Daftar();
             Login.dispose();
             JOptionPane.showMessageDialog(null,"SILAKAN ISI", "information", JOptionPane.INFORMATION_MESSAGE);
                    
        }
    });
       
     login.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
            view.Login L = new Login();
             Login.dispose();
             JOptionPane.showMessageDialog(null,"Selamat Datang Di Sistem Kampus", "information", JOptionPane.INFORMATION_MESSAGE);
                    
        }
    });
        
        
        
        
}
}