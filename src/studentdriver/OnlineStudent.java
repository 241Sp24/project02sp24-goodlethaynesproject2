package studentdriver;

public class OnlineStudent extends StudentFees {

    private int noOfMonths;
    private double MONTHLY_FEE = 1245.25;

    public OnlineStudent(String studentName, int studentID, boolean isEnrolled, int noOfMonths) {
        super(studentName, studentID, isEnrolled);
        this.noOfMonths = noOfMonths;
    }

    @Override
    public double getPayableAmount() {
        return MONTHLY_FEE * noOfMonths;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNo of Months" + noOfMonths + "\nPayable Amount: " + getPayableAmount();
    }
}
