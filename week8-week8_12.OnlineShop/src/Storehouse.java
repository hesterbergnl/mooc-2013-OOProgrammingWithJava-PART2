/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikolai
 */
import java.util.*;

public class Storehouse {
    private Map<String, Integer> prodPrice = new HashMap<String, Integer>();
    private Map<String, Integer> prodStock = new HashMap<String, Integer>();
    private Set<String> keys = prodPrice.keySet();
    private Collection<String> keySet = keys;
    
    public Storehouse(){

    }
    
    public void addProduct(String product, int price, int stock){
        prodPrice.put(product, price);
        prodStock.put(product,stock);
    }
    
    public int price(String product){
        if(keySet.contains(product)){
            return prodPrice.get(product);
        }
        else{
            return -99;
        }
    }
    
    public int stock(String product){
        if(keySet.contains(product)){
            return prodStock.get(product);
        }
        else{
            return 0;
        }
    }
    
    public boolean take(String product){
        if(keySet.contains(product) && prodStock.get(product) > 0){
            prodStock.put(product, prodStock.get(product) - 1);
            return true;
        }
        else{
            return false;
        }
    }
    
    public Set<String> products(){
        return keys;
    }
}
