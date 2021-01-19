/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public class SaveEntity_06975 extends AccountAbstractEntity_06975 {
private String user;
    public SaveEntity_06975(String nama, String npm, String angkatan, String semester) {
       
        super(nama,npm, angkatan, semester);
			this.user = user;
    }

    public SaveEntity_06975() {
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

   

}