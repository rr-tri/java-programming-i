
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rr
 */
public class UserInterface {

    private JokeManager manager;
    private Scanner scan;

    public UserInterface(JokeManager manager, Scanner scan) {
        this.scan = scan;
        this.manager = manager;
    }

    public void start() {

        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scan.nextLine();
            
            
            
            if (command.equals("X")) {
                break;
            } else if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scan.nextLine();
                this.manager.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(this.manager.drawJoke());
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.manager.printJokes();
            }
        }
    }

}
