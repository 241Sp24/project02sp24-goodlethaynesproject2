package studentdriver;

public class GraduateStudent extends StudentFees {

    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String graduateAssistantType;
    private double ADDITIONAL_FEES = 654.45;

    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled, coursesEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.graduateAssistantType = graduateAssistantType;
        this.coursesEnrolled = coursesEnrolled;
    }

    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled, coursesEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.coursesEnrolled = coursesEnrolled;
    }

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

    public boolean isIsGraduateAssistant() {
        if (isGraduateAssistant == true) {
            return true;
        } else {
            return false;
        }
    }

    public double getPayableAmount() {
        int coursesNum = getCoursesEnrolled();

        if (graduateAssistantType == null) {
            return ADDITIONAL_FEES;
        } else if (graduateAssistantType.equals("full")) {
            return ADDITIONAL_FEES;
        } else if (graduateAssistantType.equals("half")) {
            double coursesFee = coursesNum * getCREDITS_PER_COURSE() * getPER_CREFDIT_FEE() + ADDITIONAL_FEES;
            return coursesFee / 2;
        } else {
            double coursesFee = coursesNum * getCREDITS_PER_COURSE() * getPER_CREFDIT_FEE() + ADDITIONAL_FEES;
            return coursesFee;
        }
    }

    public String toString() {
        return super.toString() + "\nGraduate assistant: " + isIsGraduateAssistant() + "\nGraduate assistant type: " + graduateAssistantType + "\nCourses Enrolled: " + getCoursesEnrolled() + "\nPayable amount: " + getPayableAmount();
    }
}
