
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read:");
        String fileName = scanner.nextLine();

        System.out.println("\nCommands:");
        System.out.println("list -lists the recipes");
        System.out.println("stop -stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        while (true) {
            try (Scanner scan = new Scanner(new File(fileName))) {
                System.out.print("Enter the command: ");
                String command = scanner.nextLine();
                if (command.equals("stop")) {
                    break;
                }
                if (command.equals("list")) {
                    System.out.println("\nRecipes:");
                    while (scan.hasNextLine()) {
                        if (!scan.hasNextLine()) {
                            break;
                        }
                        String receipe = scan.nextLine();
                        String duration = scan.nextLine();

                        System.out.println(receipe + ", cooking time: " + duration);
                        while (scan.hasNextLine()) {
                            String line = scan.nextLine();
                            if (line.isEmpty()) {
                                break; // Break if reached end of recipe
                            }
                        }

                    }
                }
                if (command.equals("find name")) {
                    System.out.print("Searched word: ");
                    String search = scanner.nextLine();
                    System.out.println("\nRecipes:");
                    while (scan.hasNextLine()) {
                        if (!scan.hasNextLine()) {
                            break;
                        }
                        String receipe = scan.nextLine();
                        String duration = scan.nextLine();
                        if (receipe.contains(search)) {
                            System.out.println(receipe + ", cooking time: " + duration);
                        }
                        while (scan.hasNextLine()) {
                            String line = scan.nextLine();
                            if (line.isEmpty()) {
                                break; // Break if reached end of recipe
                            }
                        }

                    }

                }
                if (command.equals("find cooking time")) {
                    System.out.print("Max cooking time: ");
                    int search = Integer.parseInt(scanner.nextLine());

                    System.out.println("");
                    System.out.println("Recipes:");
                    while (scan.hasNextLine()) {
                        if (!scan.hasNextLine()) {
                            break;
                        }
                        String receipe = scan.nextLine();
                        int duration = Integer.parseInt(scan.nextLine());

                        if (duration <= search) {
                            System.out.println(receipe + ", cooking time: " + duration);
                        }
                        while (scan.hasNextLine()) {
                            String line = scan.nextLine();
                            if (line.isEmpty()) {
                                break; // Break if reached end of recipe
                            }
                        }

                    }

                }
                if (command.equals("find ingredient")) {
                    System.out.print("Ingredient: ");
                    String search = scanner.nextLine();

                    System.out.println("");
                    System.out.println("Recipes:");
                    while (scan.hasNextLine()) {
                        String receipe = scan.nextLine();
                        if (!scan.hasNextLine()) {
                            break;
                        } else {

                            String duration = scan.nextLine();

                            while (scan.hasNextLine()) {
                                String line = scan.nextLine();
                                if (line.isEmpty()) {
                                    break; // Break if reached end of recipe
                                }
                                if (line.equals(search)) {
                                    System.out.println(receipe + ", cooking time: " + duration);
                                    break;
                                }
                            }
                        }

                    }

                }
                System.out.println("");
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
                break;
            }
        }

    }

}
