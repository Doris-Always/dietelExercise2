package chapterNine;

public class HourlyEmployeeTest {
     public static void main(String[] args) {
          HourlyEmployee hourlyEmployee = new HourlyEmployee("Ikenna","Okeke",
                  "000-555-222",39, 500);

//          System.out.println(hourlyEmployee.earnings());

          System.out.printf("%n%s:%n%n%s%n %s: %.2f",  "Updated employee information obtained by toString",
                  hourlyEmployee.toString(),"Earning",hourlyEmployee.earnings()
          );

     }



}
