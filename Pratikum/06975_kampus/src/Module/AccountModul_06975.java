/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module;

import java.util.ArrayList;
import Entity.SaveEntity_06975;

public class AccountModul_06975 {
    private ArrayList<SaveEntity_06975> AccountArr;
    
    
    public AccountModul_06975(){
        AccountArr = new ArrayList<>();
    }   
    
    public void insert (SaveEntity_06975 saveEntity){
        AccountArr.add(saveEntity);
    }
    
    public ArrayList<SaveEntity_06975> getArraccount(){
     return AccountArr;
    }
    
    
    
    
   
	}
    
   
    
            

    

