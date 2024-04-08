package studentdriver;
import java.util.*;
import java.io.*;
public class StudentDriver {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Project02");
        
        Scanner input = new Scanner(System.in);
        File inputFile = new File("input.csv");
        System.out.println("Enter the no of UG students: ");
        int numUG = input.nextInt();
        System.out.println("Enter the no of Graduate students: ");
        int numGS = input.nextInt();
        System.out.println("Enter the no of online students: ");
        int numOS = input.nextInt();
        
        StudentFees[] students = new StudentFees[12];
        Scanner inputf = new Scanner(inputFile);
        int i = 0;
        while (inputf.hasNext()){ 
            String line = input.nextLine();
            String[] lineSplit = line.split(",");
            if (i < numUG){
                int id = Integer.parseInt(lineSplit[0]);
            }
            i++;
            
        }
        
         
    }

}
