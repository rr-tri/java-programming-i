
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                int age = Integer.parseInt(parts[1]);
                if(age==1){
                    System.out.println(parts[0]+",age: "+ age + " year");
                }else if(age>1 || age==0){
                    System.out.println(parts[0]+",age: "+ age + " years");
                }else{
                    continue;
                }
            }  
            
        }catch(Exception e){
            System.out.println("Reading the file "+ file + " failed.");
        }
    }
}
