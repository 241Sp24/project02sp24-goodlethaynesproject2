package studentdriver;

public class GraduateStudent extends StudentFees{
    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String graduateAssistantType;
    private double ADDITIONAL_FEES = 654.45;
    
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled){
        super(studentName, studentID, isEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.graduateAssistantType = graduateAssistantType;
        this.coursesEnrolled = coursesEnrolled;
    }
    
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, int coursesEnrolled){
        super(studentName, studentID, isEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.coursesEnrolled = coursesEnrolled;
    }
    
    public boolean isIsGraduateAssistant(){
        if (isGraduateAssistant == true){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getCoursesEnrolled(){
        return coursesEnrolled;
    }
    
    public double getPayableAmount(){
        int coursesNum = getCoursesEnrolled();
        double coursesFee = coursesNum * getCREDITS_PER_COURSE() * getPER_CREFDIT_FEE() + ADDITIONAL_FEES;
        if (graduateAssistantType.equals("full")){
            return ADDITIONAL_FEES;
        }
        else if (graduateAssistantType.equals("half")){
            return coursesFee / 2;
        }
        
        else{
            return coursesFee;
        }
    }
    
    public String toString(){
        return "Student name: " + getStudentName() + "\nStudent id: " + getStudentID() + "\nEnrolled: " + isIsEnrolled() + "\nGraduate assistant: " + isIsGraduateAssistant() + "\nGraduate assistant type: " + graduateAssistantType + "\nCourses enroleld" + getCoursesEnrolled() + "\nPayable amount: " + getPayableAmount();
    }
}
