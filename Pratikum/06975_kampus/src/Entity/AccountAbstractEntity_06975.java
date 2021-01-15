/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public abstract class AccountAbstractEntity_06975 {
            protected String nama, npm,angkatan, semester;
            
	
	public AccountAbstractEntity_06975(String nama, String npm, String angkatan, String semester){
		this.nama = nama;
		this.npm = npm;
		this.angkatan = angkatan;
		this.semester = semester;
		
	}
	public AccountAbstractEntity_06975(){
	}

	public abstract String getnpm();
	
	public void setnama(String nama){
		this.nama = nama;
	}
        
        public String getnama(String nama){
            return nama;
        }
        
	public String getangkatan(){
		return angkatan;
	}
	public void setangkatan(String angkatan){
		this.angkatan = angkatan;
	}
	public String getsemester(){
		return semester;
	}
	public void setsemester(String semester){
		this.semester = semester;
	}
    
}
