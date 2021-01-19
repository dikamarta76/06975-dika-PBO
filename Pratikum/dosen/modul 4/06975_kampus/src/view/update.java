/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import view.allobjctrl06975;

public class update {
 JFrame Daftar = new JFrame();
  JLabel top, namalabel,npmlabel,angkatanlabel,semesterlabel;
  JButton daftar, back;
  JTextField textnama,textnpm,textangkatan,textsemester;
  
  public update(){
  Daftar.setSize(800,630);
  Daftar.setLayout(null);
  top = new JLabel("Update");
  top.setBounds(50,10,600,50);
  top.setFont(new Font("Times New Roman", Font.BOLD, 40));
  Daftar.add(top);
  
  namalabel = new JLabel("nama");
  namalabel.setBounds(440,150,100,30);
  Daftar.add(namalabel);
  
  textnama = new JTextField();
  textnama.setBounds(400,180,200,30);
  Daftar.add(textnama);
  
  npmlabel = new JLabel("npm");
  npmlabel.setBounds(400,210,100,30);
  Daftar.add(npmlabel);
  
  textnpm = new JTextField();
  textnpm.setBounds(400,240,200,30);
  Daftar.add(textnpm);
  
  angkatanlabel = new JLabel("angkatan");
  angkatanlabel.setBounds(400,270,100,30);
  Daftar.add(angkatanlabel);
  
  textangkatan = new JTextField();
  textangkatan.setBounds(400,300,200,30);
  Daftar.add(textangkatan);
  
  semesterlabel = new JLabel("semester");
  semesterlabel.setBounds(400,330,100,30);
  Daftar.add(semesterlabel);
  
  textsemester = new JTextField();
  textsemester.setBounds(400,360,200,30);
  Daftar.add(textsemester);
  
  daftar = new JButton("Update");
  daftar.setBounds(400,420,200,30);
  Daftar.add(daftar);
  
  back = new JButton("Back");
  back.setBounds(120,320,100,40);
  Daftar.add(back);
  
  
  Daftar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  Daftar.setVisible(true);
  Daftar.setLocationRelativeTo(null);
  
  back.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
            view.GUI g = new GUI();
            Daftar.dispose();
            
        }
    });
  
  daftar.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
        
            String nama = textnama.getText();
            String npm = textnpm.getText();
            String angkatan = textangkatan.getText();
            String semester = textsemester.getText();
            allobjctrl06975.account.insertAccount(nama, angkatan, semester);
            JOptionPane.showMessageDialog(null,"Data telah disimpan", "information", JOptionPane.INFORMATION_MESSAGE);
            view.Login g = new Login();
            kosong();
        }
    });    

   back.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
            view.GUI g = new GUI();
            Daftar.dispose();
            
        }
    });
  
  
    
}
  void kosong(){
        textnama.setText(null);
        textnpm.setText(null);
        textangkatan.setText(null);
        textsemester.setText(null);
        
    }
}