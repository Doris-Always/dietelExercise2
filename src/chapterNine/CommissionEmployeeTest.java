package chapterNine;

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Doris","Ebele",
                "022-044-055",20.0,0.2);

        System.out.println("First name is: "+ commissionEmployee.getFirstName());
        System.out.println("Last name is: " + commissionEmployee.getLastName());
        System.out.printf("%s %s%n", "Social security number is",commissionEmployee.getSocialSecurityNumber() );
        System.out.printf("%s %.2f%n", "Gross sales is",commissionEmployee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", commissionEmployee.getCommissionRate());
        System.out.printf("%s %.2f%n", "earnings is", commissionEmployee.earnings());

        System.out.printf("%n%s:%n%n%s%n",  "Updated employee information obtained by toString",
                commissionEmployee.toString()
        );

    }


}
