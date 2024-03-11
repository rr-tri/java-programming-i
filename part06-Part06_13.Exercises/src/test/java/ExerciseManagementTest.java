import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class ExerciseManagementTest {
    private ExerciseManagement management;
    
    @Before
    public void initialize(){
        management = new ExerciseManagement();
    }
    
    @Test
    public void excerciseListEmptyAtBeginning(){
        ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
    }
    
    @Test 
        public void addingExerciseGrowListByOne(){
        ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertEquals(1,management.exerciseList().size());
    }
        
    @Test
    public void exerciseCanBeMarkedCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertFalse(management.isCompleted("Some exercise"));
    }
    
    @Test
    public void addedExerciseIsInList(){
        ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }
    
    
}
