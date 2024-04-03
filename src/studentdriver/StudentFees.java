package studentdriver;

public abstract class StudentFees {

    private String studentName;
    private int studentID;
    private boolean isEnrolled;
    private int CREDITS_PER_COURSE = 3;
    private double PER_CREFDIT_FEE = 543.50;

    public StudentFees(String studentName, int studentID, boolean isEnrolled) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.isEnrolled = isEnrolled;

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

    /**
     * @return the CREDITS_PER_COURSE
     */
    public int getCREDITS_PER_COURSE() {
        return CREDITS_PER_COURSE;
    }

    /**
     * @return the PER_CREFDIT_FEE
     */
    public double getPER_CREFDIT_FEE() {
        return PER_CREFDIT_FEE;
    }
    //get payable and tostring

    public double getPayableAmount() {
        return PER_CREFDIT_FEE * CREDITS_PER_COURSE;
    }

    @Override
    public String toString() {
        return "";
    }

}
