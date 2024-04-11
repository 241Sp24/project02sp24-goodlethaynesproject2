package studentdriver;

import java.util.*;
import java.io.*;

public class StudentDriver {

    public static void main(String[] args) throws FileNotFoundException {
        //Declare and initialize variables for undergrad
        double ugAvg;
        int ugScholarshipCount = 0;
        int ugTotalCourses = 0;
        double ugtotal = 0;
        int ugcount = 0;
        
        //Declare and initialize variables for grad student
        double gsAvg;
        int gsAssistantshipCount = 0;
        int gsTotalCourses = 0;
        double gstotal = 0;
        int gscount = 0;
        
        //Declare and initialize variables for online student
        double osAvg;
        double ostotal = 0;
        int oscount = 0;
        
        //Create scanner and file objects
        Scanner input = new Scanner(System.in);
        File inputFile = new File("input.csv");
        
        //Ask user for input for three different student types
        System.out.print("Enter the no of UG students: ");
        int numUG = input.nextInt();
        System.out.print("Enter the no of Graduate students: ");
        int numGS = input.nextInt();
        System.out.print("Enter the no of online students: ");
        int numOS = input.nextInt();
        
        //Create students array and update scanner
        StudentFees[] students = new StudentFees[12];
        Scanner inputf = new Scanner(inputFile);
        
        //Initialize index
        int i = 0;

        //Create a while loop to cycle through line by line on the input file
        while (inputf.hasNext()) {
            String line = inputf.nextLine();
            String[] lineSplit = line.split(","); //Split line by comma
            
            //Check if index reflects an undergrad
            if (i < numUG) {
                //Print the heading only one time
                if (i == 0) {
                    System.out.println("\n**********Undergraduate students list**********");
                }
                //Add student info to array
                int id = Integer.parseInt(lineSplit[0]);
                String name = lineSplit[1];
                boolean isEnrolled = Boolean.parseBoolean(lineSplit[2]);
                int coursesEnrolled = Integer.parseInt(lineSplit[3]);
                if (coursesEnrolled > 0 && isEnrolled != false){
                    ugTotalCourses += coursesEnrolled; //Count total courses if they are enrolled with more than 0 courses
                }
                boolean hasScholarship = Boolean.parseBoolean(lineSplit[4]);
                if (hasScholarship == true){
                    ugScholarshipCount++; //Count total scholarships if the student has a scholarship
                }
                double scholarshipAmount = Double.parseDouble(lineSplit[5]);
                //Turn the array into an undergrad object
                students[i] = new UGStudent(id, name, isEnrolled, coursesEnrolled, hasScholarship, scholarshipAmount);
                //Print the undergrad object out
                System.out.println("\n" + students[i].toString());
                //Add the payable amount to the total and add to the total count
                if (students[i].getPayableAmount() != 0){
                    ugtotal += students[i].getPayableAmount();
                    ugcount++;
                }
            }
            
            //Check if index reflects grad student
            else if (i >= numUG && i < (numGS + numUG)) {
                //Print the heading only one time
                if (i == 4) {
                    System.out.println("\n**********Graduate students list**********");
                }
                //Add student info to array
                int id = Integer.parseInt(lineSplit[0]);
                String name = lineSplit[1];
                boolean isEnrolled = Boolean.parseBoolean(lineSplit[2]);
                int coursesEnrolled = Integer.parseInt(lineSplit[3]);
                if (coursesEnrolled > 0 && isEnrolled != false){
                    gsTotalCourses += coursesEnrolled; //Count total courses if they are enrolled with more than 0 courses
                }
                boolean isGraduateAssistant = Boolean.parseBoolean(lineSplit[4]);
                if (isGraduateAssistant == true){
                    gsAssistantshipCount++; //Count total Assistantships
                }
                String graduateAssistantType;
                //Turn the array into a grad student object
                if (lineSplit.length > 5) {
                    graduateAssistantType = lineSplit[5];
                    students[i] = new GraduateStudent(name, id, isEnrolled, isGraduateAssistant, graduateAssistantType, coursesEnrolled);
                } else {
                    students[i] = new GraduateStudent(name, id, isEnrolled, isGraduateAssistant, coursesEnrolled);
                }
                //Print the grad student object out
                System.out.println(students[i].toString() + "\n");
                //Add the payable amount to the total and add to the total count
                if (students[i].getPayableAmount() != 0.00){
                    gstotal += students[i].getPayableAmount();
                gscount++;
                }
            }
            
            //Check if index reflects online student
            else if (i >= (numOS + numGS) && i <= 12) {
                //Print the heading only one time
                if (i == 9) {
                    System.out.println("\n**********Online students list**********");
                }
                //Add student info to array
                int id = Integer.parseInt(lineSplit[0]);
                String name = lineSplit[1];
                boolean isEnrolled = Boolean.parseBoolean(lineSplit[2]);
                int noOfMonths = Integer.parseInt(lineSplit[3]);
                //Turn the array into an online student object
                students[i] = new OnlineStudent(name, id, isEnrolled, noOfMonths);
                //Print the online student object out
                System.out.println(students[i].toString() + "\n");
                //Add the payable amount to the total and add to the total count
                if (students[i].getPayableAmount() != 0){    
                    ostotal += students[i].getPayableAmount();
                    oscount++;
                }
            }
            //Increase index
            i++;
        }
    
    //Print out undergrad details and calculate average
    System.out.println("**********Undergraduate Students details**********");
    ugAvg = ugtotal / ugcount;
    System.out.println("Average Students fee: " + ugAvg + "\nScholarship count: " + ugScholarshipCount + "\nTotal number of courses: " + ugTotalCourses);
    //Print out grad student details and calculate average
    System.out.println("\n**********Graduate Students details**********");
    gsAvg = gstotal / gscount;
    System.out.printf("\nAverage Students fee: %.2f\nGraduate Assistantship count: " + gsAssistantshipCount + "\nTotal number of courses: " + gsTotalCourses, gsAvg);
    //Print out online student details and calculate average
    System.out.println("\n**********Online Students details**********");
    osAvg = ostotal / oscount;
    System.out.printf("Average Students fee: %.2f", osAvg);
    }
}

