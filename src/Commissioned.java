public class Commissioned extends  Employee {
    //Attributes
    private double grossSales;
    //Constructor
    public Commissioned(String firstName, String lastName, double grossSales) {
        super(firstName, lastName);
        this.grossSales = grossSales;
    }
    //Methods and getter
    @Override
    public double calculateMonthlyPay(double grossSales) {
        return 2000 + (0.1 * grossSales);
    }

    public double getGrossSales() {
        return grossSales;
    }
}
