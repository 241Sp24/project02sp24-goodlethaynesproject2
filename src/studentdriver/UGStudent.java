package studentdriver;

public class UGStudent extends StudentFees {
//variables

    private double scholarshipAmount;
    private boolean hasScholarship;
    private double ADDITIONAL_FEE = 820.70;

    public UGStudent(int studentID, String studentName, boolean isEnrolled, int coursesEnrolled, boolean hasScholarship, double scholarshipAmount) {
        //constructors
        super(studentName, studentID, isEnrolled, coursesEnrolled);
        this.hasScholarship = hasScholarship;
        this.scholarshipAmount = scholarshipAmount;

    }
//has schlarship method

    public boolean isHasScholarship() {
        if (hasScholarship == true) {
            return true;
        } else {
            return false;
        }
    }
//get and return scholarhsip amount

    public double getScholarshipAmount() {
        return scholarshipAmount;
    }
//get payable amount = coursenum * creditpercourse * creditfee + otherfees
    //and solves for amount using schoalrhip money

    @Override
    public double getPayableAmount() {
        int coursesNum = getCoursesEnrolled();
        double coursesFee = coursesNum * getCREDITS_PER_COURSE() * getPER_CREDIT_FEE() + ADDITIONAL_FEE;
        if (isIsEnrolled() == false) {
            return 0.00;
        }
        else {
            return coursesFee - getScholarshipAmount();
        }

    }
// toString using student fee tostring for output

    @Override
    public String toString() {
        return super.toString() + "\nScholarship: " + isHasScholarship() + "\nScholarship amount: " + getScholarshipAmount() + "\nCourses Enrolled: " + getCoursesEnrolled() + "\nPayable amount: " + getPayableAmount();
    }

}
