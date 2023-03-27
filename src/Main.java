import java.util.ArrayList;

public class Main {
    private static ArrayList<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        //Instantiate employee objects
        Employee comissionedEmp = new Commissioned("Bob", "Loblaw", 40000);
        Employee salariedEmp = new Salaried("Sue", "Me", 10);
        Employee pieceWorkerEmp = new PieceWorker("Tina", "Zena", 1000);
        Employee managerEmp = new Manager("Richard", "Rich", 2000);
        //Add employee objects to employeeList
        employeeList.add(comissionedEmp);
        employeeList.add(salariedEmp);
        employeeList.add(pieceWorkerEmp);
        employeeList.add(managerEmp);

        printReport();
    }

    public static void printReport() {
        employeeList.forEach(employee -> {
            System.out.printf("Name: %s %s\n", employee.getFirstName(), employee.getLastName());
            if (employee instanceof Commissioned theComissioned) {
                System.out.printf("%-4sPay Type: %s\n", "", theComissioned.getClass().getSimpleName());
                System.out.printf("%-4sMonthly Pay: $%.2f\n\n", "", theComissioned.calculateMonthlyPay(theComissioned.getGrossSales()));
            } else if (employee instanceof Salaried theSalaried) {
                System.out.printf("%-4sPay Type: %s\n", "", theSalaried.getClass().getSimpleName());
                System.out.printf("%-4sMonthly Pay: $%.2f\n\n", "", theSalaried.calculateMonthlyPay(theSalaried.getYearsOfService()));
            } else if (employee instanceof PieceWorker thePieceWorker) {
                System.out.printf("%-4sPay Type: %s\n", "", thePieceWorker.getClass().getSimpleName());
                System.out.printf("%-4sMonthly Pay: $%.2f\n\n", "", thePieceWorker.calculateMonthlyPay(thePieceWorker.getUnitsProduced()));
            } else if (employee instanceof Manager theManager) {
                System.out.printf("%-4sPay Type: %s\n", "", theManager.getClass().getSimpleName());
                System.out.printf("%-4sMonthly Pay: $%.2f\n\n", "", theManager.calculateMonthlyPay(theManager.getMonthlyBonusAmount()));
            }
        });
    }
}