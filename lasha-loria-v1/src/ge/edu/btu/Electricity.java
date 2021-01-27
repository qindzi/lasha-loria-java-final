package ge.edu.btu;

public class Electricity {
    private String customerNumber;
    private Double amount;

    public Electricity(String customerNumber, Double amount) {
        this.customerNumber = customerNumber;
        this.amount = amount;
    }

    @Override
    public String toString() {
        String s = String.format("Electricity(customerNumber='%s', amount='%s')", customerNumber, amount);
        // return "Water(customerNumber='" + customerNumber + "', amount=" + amount + ")";
        return s;
    }
}
