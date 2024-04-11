package studentdriver;

public class GraduateStudent extends StudentFees {
    //Instance variables
    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String graduateAssistantType;
    private double ADDITIONAL_FEES = 654.45;
    
    //Constructor
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled, coursesEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.graduateAssistantType = graduateAssistantType;
        this.coursesEnrolled = coursesEnrolled;
    }

    //Constructor
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled, coursesEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.coursesEnrolled = coursesEnrolled;
    }
    
    //method to get graduate assistant type
    public String getGraduateAssistantType() {

        if (graduateAssistantType.equals("full")) {
            return "full";
        }
        if (graduateAssistantType == null) {
            return "";
        }
        if (graduateAssistantType.equals("half")) {
            return "half";
        } else {
            return "";
        }
    }
    
    //method to check if student is a graduate assistant
    public boolean isIsGraduateAssistant() {
        if (isGraduateAssistant == true) {
            return true;
        } else {
            return false;
        }
    }
    
    //method to get payable amount
    public double getPayableAmount() {
        int coursesNum = getCoursesEnrolled();

        if (graduateAssistantType == null) {
            double coursesFee = coursesNum * getCREDITS_PER_COURSE() * getPER_CREDIT_FEE() + ADDITIONAL_FEES;
            return coursesFee;
        } else if (graduateAssistantType.equals("full")) {
            return ADDITIONAL_FEES;
        } else if (graduateAssistantType.equals("half")) {
            double coursesFee = (coursesNum * getCREDITS_PER_COURSE() * getPER_CREDIT_FEE() / 2) + ADDITIONAL_FEES;  
            return coursesFee;
        } else {
            double coursesFee = coursesNum * getCREDITS_PER_COURSE() * getPER_CREDIT_FEE() + ADDITIONAL_FEES;
            return coursesFee;
        }
    }
    
    //toString method
    public String toString() {
        return super.toString() + "\nGraduate assistant: " + isIsGraduateAssistant() + "\nGraduate assistant type: " + graduateAssistantType + "\nCourses Enrolled: " + getCoursesEnrolled() + "\nPayable amount: " + getPayableAmount();
    }
}
