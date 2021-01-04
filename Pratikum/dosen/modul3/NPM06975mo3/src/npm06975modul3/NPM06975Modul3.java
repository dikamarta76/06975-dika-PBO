/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06975modul3;

/**
 *
 * @author dika
 */

import Controller.AccountController;
import Entity.SaveEntity;
import Entity.AccountAbstractEntity;
import Entity.*;
import java.util.Scanner;
import Module.AccountModul;


public class NPM06975Modul3 {
    
    
     private static AccountController account = new AccountController();              
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int loop = 0;
        do {
            
           int pilmenu;
            System.out.println("Selamat Datang "+"\n 1.create"+"\n 2.Print"+"\n 3.delete"+"\n 4.update"+"\n Masukan Pilihan Anda : ");
            pilmenu = input.nextInt();
           
            if (pilmenu == 1){
                
            System.out.println("=========================================");
        System.out.print("Input nama = ");
        String nama = input.next();
        System.out.print("Input npm = ");
        String npm = input.next();
        System.out.print("Input angkatan = ");
        int angkatan = input.nextInt();
        System.out.print("Input semester = ");
        int semester = input.nextInt();
        System.out.println("=========================================");
        account.insertAccount(nama, angkatan, semester);
        account.getSave();
           
            } else if (pilmenu == 2){
       
               for (SaveEntity arrAccount : account.getSave()){
        System.out.println("=========================================");
	System.out.println("\n  mahasiswa " + arrAccount.getnama()+"\n mahasiswa angkatan : "+ arrAccount.getangkatan()+ "\n semester : "+ arrAccount.getsemester());
	    account.getSave();
                 }
                    
            
        }else if (pilmenu == 3){
          
   Scanner in=new Scanner(System.in);
        System.out.println("apakah kamu ingin menghapus data ?");
        String num=in.next("y");
        account.getSave().remove(0);
   
      
        
        }else if (pilmenu == 4){
        System.out.println("=========================================");
        System.out.print("Input nama = ");
        String nama = input.next();
        System.out.print("Input npm = ");
        String npm = input.next();
        System.out.print("Input angkatan = ");
        int angkatan = input.nextInt();
        System.out.print("Input semester = ");
        int semester = input.nextInt();
        System.out.println("=========================================");
        
        
        account.insertAccount(nama, angkatan, semester);
        account.getSave().remove(0);
        } else
      throw new IllegalArgumentException ("maaf yang anda inputkan salah");
       
 }while(loop!=1);
        }
    
    
    
    }


        

