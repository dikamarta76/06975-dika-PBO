/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author dika
 */
public abstract class AccountAbstractEntity {
            protected String nama, npm;
            protected int angkatan, semester;
	
	public AccountAbstractEntity(String nama, String npm, int angkatan, int semester){
		this.nama = nama;
		this.npm = npm;
		this.angkatan = angkatan;
		this.semester = semester;
		
	}
	public AccountAbstractEntity(){
	}

	
	public String getnpm(){
		return npm;
	}
	public void setnama(String nama){
		this.nama = nama;
	}
        
        public String getnama(String nama){
            return nama;
        }
        
	public int getangkatan(){
		return angkatan;
	}
	public void setangkatan(int angkatan){
		this.angkatan = angkatan;
	}
	public int getsemester(){
		return semester;
	}
	public void setsemester(int semester){
		this.semester = semester;
	}
    
}
