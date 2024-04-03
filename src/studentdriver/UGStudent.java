package studentdriver;

public class UGStudent extends StudentFees {
    private double scholarshipAmount;
    private int coursesEnrolled;
    private boolean hasScholarship;
    private double ADDITIONAL_FEE = 820.70;
    
    public UGStudent(String studentName, int studentID, boolean isEnrolled, boolean hasScholarship, double scholarshipAmount, int coursesEnrolled){
        super(studentName, studentID, isEnrolled);
        this.hasScholarship = hasScholarship;
        this.scholarshipAmount = scholarshipAmount;
        this.coursesEnrolled = coursesEnrolled; 
    }
    
    public boolean isHasScholarship(){
        if (hasScholarship == true){
            return true;
        }
        else{
            return false;
        }
    }
    
    public double getScholarshipAmount(){
        return scholarshipAmount;
    }
    
    public int getCoursesEnrolled(){
        return coursesEnrolled;
    }
    
    public double getPayableAmount(){
        int coursesNum = getCoursesEnrolled();
        double coursesFee = coursesNum * getCREDITS_PER_COURSE() * getPER_CREFDIT_FEE() + ADDITIONAL_FEE;
        return coursesFee - getScholarshipAmount();
        
    }
    
    public String toString(){
        return "Student name: " + getStudentName() + "\nStudent id: " + getStudentID() + "\nEnrolled: " + isIsEnrolled() + "\nScholarship: " + isHasScholarship() + "\nScholarship amount: " + getScholarshipAmount() + "\nCourses enrolled: " + getCoursesEnrolled() + "\nPayable amount: " + getPayableAmount();
    }
       
}
