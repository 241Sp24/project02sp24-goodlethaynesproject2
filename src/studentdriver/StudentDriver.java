package studentdriver;

import java.util.*;
import java.io.*;

public class StudentDriver {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Project02");

        Scanner input = new Scanner(System.in);
        File inputFile = new File("input.csv");
        System.out.print("Enter the no of UG students: ");
        int numUG = input.nextInt();
        System.out.print("Enter the no of Graduate students: ");
        int numGS = input.nextInt();
        System.out.print("Enter the no of online students: ");
        int numOS = input.nextInt();

        StudentFees[] students = new StudentFees[12];
        Scanner inputf = new Scanner(inputFile);

        int i = 0;

        while (inputf.hasNext()) {
            String line = inputf.nextLine();
            String[] lineSplit = line.split(",");
            if (i < numUG) {
                int id = Integer.parseInt(lineSplit[0]);
                //String name = String.parseString(lineSplit[1]);
                //boolean isEnrolled = boolean.parse(lineSplit[]);
                int coursesEnrolled = Integer.parseInt(lineSplit[3]);
                //boolean hasScholarship = boolean.parse(lineSplit[2]);
                //Double scholarshipAmount = double.parse(lineSplit[]);
            }
            if (i < numGS) {
                int id = Integer.parseInt(lineSplit[0]);
                //String name = String.parseString(lineSplit[1]);
                //boolean isEnrolled = boolean.parse(lineSplit[]);
            }
            if (i < numOS) {
                int id = Integer.parseInt(lineSplit[0]);
                //String name = String.parseString(lineSplit[1]);
                //boolean isEnrolled = boolean.parse(lineSplit[]);
            }
            i++;

        }

    }

}
