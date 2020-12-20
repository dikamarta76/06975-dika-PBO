/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Pengguna.*;
import sistem.Npm06975admin;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author erye
 */
public class Npm06975Main {
    static Scanner scan=new Scanner(System.in);
    static ArrayList<Npm06975dosen>dosenArr=new ArrayList<>();
    static ArrayList<Npm06975mahasiswa>mahasiswaArr=new ArrayList<>();
    static ArrayList<Npm06975admin>adminArr=new ArrayList<>();
    
    public static void main(String[] args) {
        int menu;
        Npm06975Main main=new Npm06975Main();
        do{
        
        System.out.println("\nMenu :");
        System.out.println("1. Tambah dosen ");
        System.out.println("2. Tambah mahasiswa ");
        System.out.println("3. Tambah sks");
        System.out.println("4. Tampilkan Data ");
        System.out.println("0. Selesai");
        System.out.print("Masukkan Nomor Menu : ");
        menu=scan.nextInt();
        
        switch (menu){
            
            case 1:
                Npm06975Main.tambahdosen();
                break;
            case 2:
                Npm06975Main.tambahmahasiswa();
                break;
            case 3:
                Npm06975Main.tambahadmin();
                break;
            case 4:
                Npm06975Main.tampilkanData();
            default :
                menu =0;
                System.out.println("Terima Kasih Telah Menggunakan Sistem kampus");
        }
    }while (menu !=0);
}

    static void tampilkanData(){
        System.out.println("\nData dosen : ");
        for(int i=0;i<dosenArr.size();i++){
             dosenArr.get(i).print();
        }
        System.out.println("\nData mahasiswa : ");
        for(int i=0;i<mahasiswaArr.size();i++){
            mahasiswaArr.get(i).print();
        }
        System.out.println("\nData admin : ");
        for(int i=0;i<adminArr.size();i++){
            adminArr.get(i).print();
        }
    
    }
        static void tambahdosen(){
            System.out.println("Tambah Data dosen");
            Npm06975dosen dosen=new Npm06975dosen();
            System.out.println("ID dosen : "+String.valueOf(dosenArr.size()+1));
            dosen.setId(dosenArr.size()+1);
            System.out.println("Nama dosen : ");
            dosen.setNama(scan.next());
            System.out.println("Kata Sandi dosen : ");
            dosen.setKataSandi(scan.next());
            System.out.print("Nomor HP dosen : ");
            dosen.setNoHp(scan.nextInt());
        
            dosenArr.add(dosen);
    }

        static void tambahmahasiswa(){
            System.out.println("Tambah Data mahasiswa");
            Npm06975mahasiswa mahasiswa=new Npm06975mahasiswa();
            System.out.println("ID mahasiswa : "+String.valueOf(mahasiswaArr.size()+1));
            mahasiswa.setId(mahasiswaArr.size()+1);
            System.out.println("Nama mahasiswa : ");
            mahasiswa.setNama(scan.next());
            System.out.print("Nomor Hp mahasiswa : ");
            mahasiswa.setNoHp(scan.nextInt());
            mahasiswaArr.add(mahasiswa);
        }
        
        static void tambahadmin(){
            System.out.println("Tambah Data admin");
            Npm06975admin admin=new Npm06975admin();
            if (dosenArr.isEmpty() && mahasiswaArr.isEmpty()){
                System.out.println("Data Masih Kosong!");
            }else {
                System.out.print("ID dosen : ");
                admin.setdosen(dosenArr.get(scan.nextInt()-1));
                System.out.print("ID Pelanggan : ");
                admin.setmahasiswa(mahasiswaArr.get(scan.nextInt()-1));
                System.out.print("semester sekarang  : ");
                admin.getTotalsks(scan.nextFloat());
                
                adminArr.add(admin);
            }
        }
}
