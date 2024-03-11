
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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        int total = 0;
        for(Suitcase s: suitcases){
            total += s.totalWeight();
        }
        if(total+suitcase.totalWeight()<= this.maxWeight){
            this.suitcases.add(suitcase);
        }
        
    }
    
    public String toString(){
        int total = 0;
        for(Suitcase s: suitcases){
            total += s.totalWeight();
        }
        return this.suitcases.size() + " suitcases ("+ total + " kg)";
    }
    public void printItems(){
        for(Suitcase s: suitcases){
            s.printItems();
        }
        
    }
}






































