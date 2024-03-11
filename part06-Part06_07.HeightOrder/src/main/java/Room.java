
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
public class Room {
    private ArrayList<Person> persons;
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        Person shortPerson = persons.isEmpty() ? null : persons.get(0);
        
        for(Person p : persons){
            if(p.getHeight() < shortPerson.getHeight()){
                shortPerson = p;
            }
        }
        return shortPerson;
    }
    public Person take(){
        if(this.persons.isEmpty()){
            return null;
        }
        Person shortPerson = this.shortest();
        this.persons.remove(shortPerson);
        return shortPerson;
    }
    
    
    
    
    
    
    
    
    
}
