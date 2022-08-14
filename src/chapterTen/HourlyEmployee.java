package chapterTen;

public class HourlyEmployee extends Employee{

    private double hours;

    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber
    ,double hours,double wage){
        super(firstName, lastName, socialSecurityNumber);

        if (hours < 0.0 || hours > 168.0){
            throw new IllegalArgumentException("hours cannot be < 0.0 or >168.0");
        }

        if (wage < 0.0){
            throw new IllegalArgumentException("hourly wage cannot be < 0.0");
        }

        this.hours =hours;
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0){
            throw new IllegalArgumentException("hours cannot be < 0.0 or >168.0");
        }
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {

        if (wage < 0.0){
            throw new IllegalArgumentException("hourly wage cannot be < 0.0");
        }
        this.wage = wage;
    }


    @Override
    public double earning() {
        double earn;
        if (getHours() < 40){
            earn = getHours() * getWage();

        }else {
            earn = 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
        return earn;
    }

    @Override
    public String toString(){
        return String.format("Hourly employee: %s%n%s: %2f",
                super.toString(),"Hour: ",getHours(),"Wage: ",getWage());
    }
}
