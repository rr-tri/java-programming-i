
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        int sum = 0;
        int num = 0;
        int pass = 0;
        int passNum = 0;
        int[] gradeDistribution = {0,0,0,0,0,0};
        while (true) {
            int point = scanner.nextInt();
            if (point == -1) {
                break;
            }
  
            if (point > 0 && point <= 100) {
                sum += point;
                num++;
                
                if(point<50){
                    gradeDistribution[0]++;
                }else if(point<60){
                    gradeDistribution[1]++;
                }else if(point<70){
                    gradeDistribution[2]++;
                }else if(point<80){
                    gradeDistribution[3]++;
                }else if(point<90){
                    gradeDistribution[4]++;
                }else{
                    gradeDistribution[5]++;
                }
                
                if (point >= 50) {
                    pass += point;
                    passNum++;
                }
            }
        }
        
        System.out.println("Point average (all): " + (double) sum / num);
        
        if(passNum > 0){
            System.out.println("Point average (passing): " + (double) pass / passNum);
            System.out.println("Pass percentage: "+ 100* ((double) passNum/num));
        }else{
            System.out.println("Point average (passing): -");
            System.out.println("Pass percentage: 0.0");
        }
        System.out.println("Grade distribution:");
        for(int i=gradeDistribution.length-1; i>=0; i--){
            String stars = "";
            for (int j = 0; j < gradeDistribution[i]; j++) {
                stars += "*";
            }
            System.out.println(i+": "+ stars);
        }

    }
}
