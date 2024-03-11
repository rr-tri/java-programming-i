
import java.util.ArrayList;


public class ExerciseManagement {
    private ArrayList<Exercise> exercises;
  

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
        
    }
    
    
    public ArrayList<String> exerciseList(){
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise: exercises){
            list.add(exercise.getName());
        }
        return list;
    }
    
    public void add(String exercise){
        this.exercises.add(new Exercise(exercise));
    }
    
    public void markAsCompleted(String exercise){
       for(Exercise e: exercises){
           e.setCompleted(true);
       }
    }
    
    public Boolean isCompleted(String exercise){
        for(Exercise e: exercises){
           if(e.getName().equals(exercise)){
            return e.isCompleted();   
           }
            
       }
        return false;
    }
}
