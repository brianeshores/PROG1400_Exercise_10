public class Salaried extends  Employee {
    private int yearsOfService;

    public Salaried(String firstName, String lastName, int yearsOfService) {
        super(firstName, lastName);
        this.yearsOfService = yearsOfService;
    }

    public double calculateMonthlyPay(int yearsOfService) {
        return (50000 + 50000 * (0.01 * yearsOfService)) / 12;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }
}
