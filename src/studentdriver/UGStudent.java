package studentdriver;

public class UGStudent extends StudentFees {

    private double scholarshipAmount;

    private boolean hasScholarship;
    private double ADDITIONAL_FEE = 820.70;

    public UGStudent(int studentID, String studentName, boolean isEnrolled, int coursesEnrolled, boolean hasScholarshipdouble, double scholarshipAmount) {
        super(studentName, studentID, isEnrolled, coursesEnrolled);
        this.hasScholarship = hasScholarship;
        this.scholarshipAmount = scholarshipAmount;

    }

    public boolean isHasScholarship() {
        if (hasScholarship == true) {
            return true;
        } else {
            return false;
        }
    }

    public double getScholarshipAmount() {
        return scholarshipAmount;
    }

    public double getPayableAmount() {
        int coursesNum = getCoursesEnrolled();
        double coursesFee = coursesNum * getCREDITS_PER_COURSE() * getPER_CREFDIT_FEE() + ADDITIONAL_FEE;
        return coursesFee - getScholarshipAmount();

    }

    public String toString() {
        return super.toString() + "\nScholarship: " + isHasScholarship() + "\nScholarship amount: " + getScholarshipAmount() + "\nPayable amount: " + getPayableAmount();
    }

}
