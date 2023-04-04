package simple.hr;

public class Contractor implements Payable{

    private int hoursWorked;
    private double partsCost;
    @Override
    public double calcualtePay() {
        return hoursWorked * partsCost;
    }

    @Override
    public String generatePayStub() { //invoice
        return null;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPartsCost(double partsCost) {
        this.partsCost = partsCost;
    }
}
