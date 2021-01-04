/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.AccountAbstractEntity;
import Entity.SaveEntity;
import Module.AccountModul;
import java.util.ArrayList;
public class AccountController {
private AccountModul account = new AccountModul();

public AccountController (){
}

public void insertAccount(String nama, int angkatan, int semester){
SaveEntity save = new SaveEntity();
save.setnama("nama : "+nama);
save.setangkatan(angkatan);
save.setsemester(semester);
account.insert(save);

}

public ArrayList<SaveEntity> getSave(){
    return account.getArraccount();
    
}


}

