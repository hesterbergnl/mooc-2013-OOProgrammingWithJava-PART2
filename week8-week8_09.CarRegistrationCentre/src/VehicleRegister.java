/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hesterberg
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleRegister {
    private HashMap<RegistrationPlate,String> owners = new HashMap<RegistrationPlate, String>();
   
    public VehicleRegister(){        
    }
 
    public boolean add(RegistrationPlate plate, String owner){
        if(owners.get(plate) != null){
            return false;
        }
        this.owners.put(plate, owner);
        return true;
    }
    
    public String get(RegistrationPlate plate){
        if(owners.get(plate) == null){
            return null;
        }
        return owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate){
        if(owners.get(plate) == null){
            return false;
        }
        owners.remove(plate);
        return true;
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate item : this.owners.keySet()){
            System.out.println(item);
        }
    }
    
    public void printOwners(){
        ArrayList<String> ownerArray = new ArrayList<String>();
        for(RegistrationPlate item : this.owners.keySet()){
            if(!ownerArray.contains(owners.get(item))){
                ownerArray.add(owners.get(item));
            }
        }
        for(String item : ownerArray){
            System.out.println(item);
        }
    }
}
