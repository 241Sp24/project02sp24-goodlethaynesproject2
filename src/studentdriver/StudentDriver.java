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
                String name = lineSplit[1];
                boolean isEnrolled = Boolean.parseBoolean(lineSplit[2]);
                int coursesEnrolled = Integer.parseInt(lineSplit[3]);
                boolean hasScholarship = Boolean.parseBoolean(lineSplit[4]);
                double scholarshipAmount = Double.parseDouble(lineSplit[5]);
                UGStudent student = new UGStudent(id, name, isEnrolled, coursesEnrolled, hasScholarship, scholarshipAmount);
                students[i] = student;
                if (i == 0){
                    System.out.println("\n**********Undergraduate students list**********");
                }
                System.out.println("\nUGStudent \n" + student.toString());
            }
            if (i >= numUG && i <= (numGS + 4)) {
                int id = Integer.parseInt(lineSplit[0]);
                String name = lineSplit[1];
                boolean isEnrolled = Boolean.parseBoolean(lineSplit[2]);
                int coursesEnrolled = Integer.parseInt(lineSplit[3]);
                boolean isGraduateAssistant = Boolean.parseBoolean(lineSplit[4]);
                String graduateAssistantType;
                if (i != 6){
                    graduateAssistantType = lineSplit[5];
                    GraduateStudent student = new GraduateStudent(name, id, isEnrolled, isGraduateAssistant, graduateAssistantType, coursesEnrolled);
                }
                GraduateStudent student = new GraduateStudent(name, id, isEnrolled, isGraduateAssistant, coursesEnrolled);
                students[i] = student;
                if (i == 4){
                    System.out.println("\n**********Graduate students list**********");
                }
                System.out.println("\nGraduateStudent \n" + student.toString() + "\n");
            }
            if (i >= (numOS + 7)) {
                int id = Integer.parseInt(lineSplit[0]);
                String name = lineSplit[1];
                boolean isEnrolled = Boolean.parseBoolean(lineSplit[2]);
                int coursesEnrolled = Integer.parseInt(lineSplit[3]);
                int noOfMonths = Integer.parseInt(lineSplit[4]);
                OnlineStudent student = new OnlineStudent(name, id, isEnrolled, noOfMonths, coursesEnrolled);
                students[i] = student;
                if (i == 8){
                    System.out.println("\n**********Online students list**********");
                }
                System.out.println("\nOnlineStudent \n" + student.toString());
            }
            i++;

        }

    }

}
