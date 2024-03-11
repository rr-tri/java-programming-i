
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
    
    public String longest(){
        if(this.elements.isEmpty()){
            return null;
        }
        String longString="";
        for(String s: elements){
            if(s.length()>longString.length()){
                longString = s;
            }
        }
        return longString;
    }
    
    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

}
