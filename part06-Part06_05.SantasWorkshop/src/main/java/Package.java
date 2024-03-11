
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rr
 */
public class Package {
    private ArrayList<Gift> gifts;
    public Package() {
        this.gifts = new ArrayList<>();
    }
    public void addGift(Gift gift){
        Boolean exists = false;
        for(Gift g: gifts){
                if(gift.getName().equals(g.getName())){
                    exists = true;
                }
        }
        if(!exists){
            this.gifts.add(gift);
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        
        for( Gift g: gifts){
            totalWeight += g.getWeight();
        }
        return totalWeight;
    }
}


































