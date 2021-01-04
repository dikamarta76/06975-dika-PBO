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
public class SaveEntity extends AccountAbstractEntity {
private String user;
    public SaveEntity(String nama, String npm, int angkatan, int semester) {
       
        super(nama,npm, angkatan, semester);
			this.user = user;
    }

    public SaveEntity() {
        this.user = user;
    }

@Override
    public String getnpm() {
     return npm;   
    }

   public String getSaveEntity(){
    return user;
    
}

public void setSaveEntity(){
    this.user= user;

}

    public String getnama() {
        return nama;
        }

  
}