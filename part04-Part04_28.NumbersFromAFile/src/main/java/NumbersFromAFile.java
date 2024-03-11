
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            int num=0;
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                int number = Integer.parseInt(line);
                if(number >= lowerBound && number <= upperBound){
                    num += 1;
                }
            }  
            System.out.println("Numbers: "+ num);
        }catch(Exception e){
            System.out.println("Reading the file "+ file + " failed.");
        }
    }

}
