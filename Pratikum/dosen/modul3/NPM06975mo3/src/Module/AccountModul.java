/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module;

/**
 *
 * @author dika
 */

import java.util.ArrayList;
import Entity.SaveEntity;

public class AccountModul {
    private ArrayList<SaveEntity> AccountArr;
    
    
    public AccountModul(){
        AccountArr = new ArrayList<>();
    }   
    
    public void insert (SaveEntity saveEntity){
        AccountArr.add(saveEntity);
    }
    
    public ArrayList<SaveEntity> getArraccount(){
     return AccountArr;
    }
    
    
    
    
   
	}
    
   
    
            

    

