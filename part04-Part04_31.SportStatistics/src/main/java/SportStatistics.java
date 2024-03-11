
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Filename:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
           int count = 0;
           int wcount = 0;
           int lcount = 0;
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                int htp = Integer.parseInt(parts[2]);
                int vtp = Integer.parseInt(parts[3]);
                if(parts[0].contains(team) || parts[1].contains(team)){
                    count += 1;
                }
                if(parts[0].contains(team) && htp>vtp || parts[1].contains(team) && htp<vtp){
                    wcount++;
                }
                if(parts[0].contains(team) && htp<vtp || parts[1].contains(team) && htp>vtp){
                    lcount++;
                }
            }
            System.out.println("Games: "+count);
             System.out.println("Wins: "+wcount);
              System.out.println("Losses: "+lcount);
        }catch(Exception e){
            System.out.println("Reading the file "+ file + " failed.");
        }
    }

}
