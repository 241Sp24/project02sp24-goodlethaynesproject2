package studentdriver;

public class OnlineStudent extends StudentFees {

    //variables
    private int noOfMonths;
    private double MONTHLY_FEE = 1245.25;

    public OnlineStudent(String studentName, int studentID, boolean isEnrolled, int noOfMonths) {
        //constructors
        super(studentName, studentID, isEnrolled);
        this.noOfMonths = noOfMonths;
    }

    //payable amount of month fee * no of months
    @Override
    public double getPayableAmount() {
        return MONTHLY_FEE * noOfMonths;
    }

    //to string fro online student inherits student fees tostring
    @Override
    public String toString() {
        return super.toString() + "\nNo of Months: " + noOfMonths + "\nPayable Amount: " + getPayableAmount();
    }
}
