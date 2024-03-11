
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.print("?");
            String command = scan.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();

                System.out.print("Name in Latin: ");
                String latin = scan.nextLine();

                birds.add(new Bird(name, latin));

            }
            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                Boolean isBird = false;
                for (Bird bird : birds) {
                    if (bird.getName().equals(birdName)) {
                        bird.observe();
                        isBird = true;
                        break;
                    }
                }
                if (!isBird) {
                    System.out.println("Not a bird!");
                }

            }
            if (command.equals("All")) {
               
                for (int i = birds.size()-1; i >= 0; i--) {
                    Bird get = birds.get(i);
                     System.out.println(get);
                }
            }
            if (command.equals("One")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                for (Bird bird : birds) {
                    if(bird.getName().equals(birdName)){
                        System.out.println(bird);
                        break;
                    }
                }
            }
        }
    }

}
