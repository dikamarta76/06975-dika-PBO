/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.AccountAbstractEntity_06975;
import Entity.SaveEntity_06975;
import Module.AccountModul_06975;
import java.util.ArrayList;
import javax.swing.JTextArea;
public class AccountController_06975 {
private AccountModul_06975 account = new AccountModul_06975();

public AccountController_06975 (){
}

public void insertAccount(String nama, String angkatan, String semester){
SaveEntity_06975 save = new SaveEntity_06975();
save.setnama("nama : "+nama);
save.setangkatan(angkatan);
save.setsemester(semester);
account.insert(save);


}

public ArrayList<SaveEntity_06975> getSave(){
    return account.getArraccount();
    
}

    public ArrayList<SaveEntity_06975> getSave(JTextArea area) {
      return  account.getArraccount();
    }




}

