
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        Boolean exists = false;
        for (String m : this.meals) {
            if (m.equals(meal)) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for (String m : this.meals) {
            System.out.println(m);
        }
    }

    public void clearMenu() {
        System.out.println("");
        this.meals.clear();
    }

}
