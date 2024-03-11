/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rr
 */
public class Item {
    private String identifier;
    private String name;
    
    public  Item(String identifier,String name){
        this.identifier = identifier;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getIdentifier() {
        return identifier;
    }
}
