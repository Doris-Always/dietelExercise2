package chapterNine;

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee baseSalaryEmployee = new BasePlusCommissionEmployee("Temitope",
                "Oloowokere","555-555-000",22.4,0.1,5000);

        System.out.println("base salary employee first name"+" " + baseSalaryEmployee.getFirstName());
        System.out.println("base salary employee last name" + " " + baseSalaryEmployee.getLastName());
        System.out.println("base salary employee social security number" + " " + baseSalaryEmployee.getSocialSecurityNumber());
        System.out.println("base salary employee gross sales" + " " + baseSalaryEmployee.getGrossSales());
        System.out.println("base salary employee commission" + " " + baseSalaryEmployee.getCommissionRate());
        System.out.println("base salary employee last name" + " " + baseSalaryEmployee.earnings());



        System.out.printf("%n%s:%n%n%s %s %s %s%n",  "Updated employee information obtained by toString",
           "base salary: ",baseSalaryEmployee.toString(), "Earnings",baseSalaryEmployee.earnings());

    }
}
