package chapterNine;

public class HourlyEmployee extends Employee {
    private double hours;

    private double wage;

    public HourlyEmployee(String firstName, String lastName,
                          String socialSecurityNumber, double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        this.hours = hours;
        this.wage = wage;
    }

    public void setHours(double hours) {
        if (hours == 0.0 && hours <= 168.0){
            this.hours = hours;
        }
        throw new IllegalArgumentException("hours must be > 0.0 and <= 168");
    }

    public double getHours() {
        return hours;
    }

    public void setWage(double wage) {
        if (wage > 0.0) this.wage = wage;
        throw new IllegalArgumentException("wage must be > 0.0 ");
    }

    public double getWage() {
        return wage;
    }

    public double earnings(){
        if (getHours() <= 40){
            return wage * hours;
        }
        return wage * 1.5;


    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n %s: %s%n %s: %.2f%n %s: %.2f",
                "hourly employee",getFirstName(),getLastName(),
                "social security number",getSocialSecurityNumber(),
                "number of hours",getHours(),
                "wage per hour",getWage());

    }
}
