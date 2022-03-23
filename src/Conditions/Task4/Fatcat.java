package Conditions.Task4;

import java.util.Objects;

public class Fatcat {
    private String name;
    private int salary;
    private boolean bonus;

    public Fatcat() {
    }

    public Fatcat(String name, int salary, boolean bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isBonus() {
        return bonus;
    }

    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fatcat fatcat = (Fatcat) o;
        return salary == fatcat.salary &&
                bonus == fatcat.bonus &&
                Objects.equals(name, fatcat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, bonus);
    }
     public void GetBonus(int salary,boolean bonus){
        if(bonus){
            salary*=10;
            System.out.println(this.name+" get bonus and totally get "+salary+"\u00A3");
        }
        else{
            System.out.println(this.name+" does not get bonus and totally get "+salary+"\u00A3");
        }
     }

}
