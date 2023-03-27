public abstract class Employee {
    //Attributes
    private String firstName;
    private String lastName;
    //Constructor
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //Methods and getters
    public double calculateMonthlyPay(double salary) {
        return salary / 12;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


}

