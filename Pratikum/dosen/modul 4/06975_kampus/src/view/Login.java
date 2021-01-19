/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Controller.AccountController_06975;
import Entity.SaveEntity_06975;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.text.Document;
import view.allobjctrl06975;
import static view.allobjctrl06975.account;

public class Login {
JFrame Login = new JFrame();
JButton login,back,update,hapus;
JTextField textnama,textnpm;
JTextArea area = new JTextArea();;
JLabel labellogin,labelnama,labelnpm;

public Login(){
        
Login.setSize(720,600);
Login.setLayout(null);
labellogin = new JLabel("LOGIN Account");
labellogin.setFont(new Font("Times New Roman", Font.BOLD,28));
labellogin.setBounds(90,30,200,30);
Login.add(labellogin);

area.setBounds(30,90,400,300);
Login.add(area);

  labelnama = new JLabel("nama");
  labelnama.setBounds(440,150,100,30);
  Login.add(labelnama);
  
  textnama = new JTextField();
  textnama.setBounds(440,180,200,30);
  Login.add(textnama);
  
  labelnpm = new JLabel("npm");
  labelnpm.setBounds(440,210,100,30);
  Login.add(labelnpm);
  
  textnpm = new JTextField();
  textnpm.setBounds(440,240,200,30);
  Login.add(textnpm);

  
  login = new JButton("Login");
  login.setBounds(440,280,100,30);
  Login.add(login);
  
  update = new JButton("Update");
  update.setBounds(440,340,100,30);
  Login.add(update);
  
  back = new JButton("Back");
  back.setBounds(440,390,100,30);
  Login.add(back);
  
  hapus = new JButton("Hapus");
  hapus.setBounds(440,440,100,30);
  Login.add(hapus);
  
  

Login.setVisible(true);
Login.setLocationRelativeTo(null);
Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

login.addActionListener(new ActionListener(){
    String accountsave;
            @Override
            public void actionPerformed(ActionEvent ae){
            for (SaveEntity_06975 arrAccount : account.getSave()){
	    String text ="\n angkatan : "+ arrAccount.getangkatan()+ "\n semester : "+ arrAccount.getsemester();
	    area.setText("Data anda\n"+text);
            account.getSave();
            JOptionPane.showMessageDialog(null,"Selamat Datang", "information", JOptionPane.INFORMATION_MESSAGE);
            kosong();
                 } 
            }
    

});

update.addActionListener(new ActionListener(){
   
            @Override
            public void actionPerformed(ActionEvent ae){
            view.update g = new update();
            JOptionPane.showMessageDialog(null," mau merubah data ?", "information", JOptionPane.INFORMATION_MESSAGE);
            Login.dispose();
            }
    

});
        
hapus.addActionListener(new ActionListener(){
   
            @Override
            public void actionPerformed(ActionEvent ae){
            allobjctrl06975.account.getSave().remove(0);
            JOptionPane.showMessageDialog(null,"Data Telah Terhapus", "information", JOptionPane.INFORMATION_MESSAGE);
            view.GUI g = new GUI();
            Login.dispose();
            //area.remove(0);
            }
    

});

 back.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
            view.GUI g = new GUI();
            Login.dispose();
            
        }
    });

        
}
void kosong(){
        textnama.setText(null);
        textnpm.setText(null);
        
        
    }
}    
                