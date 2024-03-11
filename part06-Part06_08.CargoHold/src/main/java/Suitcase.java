
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
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public int totalWeight(){
        int total = 0;
        for(Item i : items){
            total += i.getWeight();
        }
        return total;
    }
    
    public void addItem(Item item){
        if(this.totalWeight()+item.getWeight() <= this.maxWeight){
            this.items.add(item);    
        }
        
    }
    
    public String toString(){
       
        int size = this.items.size();
        if(size==0){
            return "no items (0 kg)";

        }else if(size==1){
            return this.items.size() +" item ("+ totalWeight() + " kg)";

        }
        return this.items.size() +" items ("+ totalWeight() + " kg)";
    }
    
    public void printItems(){
        for(Item i : items){
            System.out.println(i);
        }
        
    }
    
    public Item heaviestItem(){
        
        Item item = this.items.isEmpty()? null : this.items.get(0);
        
        for(Item i : this.items){
            if(item.getWeight()<i.getWeight()){
                item = i;
            }
        }
        return item;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
