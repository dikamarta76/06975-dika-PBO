/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem;
import Pengguna.*;
/**
 *
 * @author 
 */
public class Npm06975admin {

    private Npm06975dosen dosen;
    private Npm06975mahasiswa mahasiswa;
    private float sks;
    private float Totalsks;
    private float persks=24;
    
    private Npm06975dosen getdosen() {
        return dosen;
    }

    public void setdosen(Npm06975dosen dosen) {
        this.dosen = dosen;
    }

    private Npm06975mahasiswa getmahasiswa() {
        return mahasiswa;
    }

    public void setmahasiswa(Npm06975mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    private float getsks() {
        return sks;
    }

    private float getPersks() {
        return this.persks;
    }

    public float getTotalsks(float sks) {
        this.sks=sks;
        return this.sks;
    }

    private float getTotalsks(float sks,float persks) {
        return this.Totalsks = sks * persks;
    }
    
    public void print (){
        System.out.println("Nama dosen : "+this.getdosen().getNama());
        System.out.println("Nama mahasiswa : "+this.getmahasiswa().getNama());
        System.out.println("Berapa sks : "+this.getsks() + " sks = ");
        System.out.println("Total sks sekarang :  "+this.getTotalsks(this.getTotalsks(sks), this.getPersks()));
    }

   

    
}
