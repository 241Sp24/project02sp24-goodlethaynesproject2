package studentdriver;

public abstract class StudentFees {
    //Instance variables
    private String studentName;
    private int studentID;
    private int coursesEnrolled;
    private boolean isEnrolled;
    private int CREDITS_PER_COURSE = 3;
    private double PER_CREFDIT_FEE = 543.50;
    
    //Constructor
    public StudentFees(String studentName, int studentID, boolean isEnrolled, int coursesEnrolled) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.isEnrolled = isEnrolled;
        this.coursesEnrolled = coursesEnrolled;

    }
    
    //Constructor
    public StudentFees(String studentName, int studentID, boolean isEnrolled) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.isEnrolled = isEnrolled;

    }

    //Method to get courses enrolled
    public int getCoursesEnrolled() {
        return coursesEnrolled;
    }

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the studentID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /**
     * @param isEnrolled the isEnrolled to set
     */
    public void setIsEnrolled(boolean isEnrolled) {
        this.isEnrolled = isEnrolled;
    }
    
    //method to check if student is enrolled
    public boolean getIsEnrolled() {
        return isEnrolled;
    }

    /**
     * @return the CREDITS_PER_COURSE
     */
    public int getCREDITS_PER_COURSE() {
        return CREDITS_PER_COURSE;
    }

    /**
     * @return the PER_CREFDIT_FEE
     */
    public double getPER_CREDIT_FEE() {
        return PER_CREFDIT_FEE;
    }
    
    //get payable amount
    public double getPayableAmount() {
        return PER_CREFDIT_FEE * CREDITS_PER_COURSE;
    }
    
    //toString method
    @Override
    public String toString() {
        return "Student Name: " + getStudentName() + "\nStudent id: " + getStudentID() + "\nEnrolled: " + getIsEnrolled();
    }

    //Method to check if the student is enrolled
    public boolean isIsEnrolled() {
        if (isEnrolled == true) {
            return true;
        } else {
            return false;
        }
    }

}
