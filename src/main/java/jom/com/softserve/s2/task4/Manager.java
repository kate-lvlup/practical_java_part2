package jom.com.softserve.s2.task4;

import java.math.BigDecimal;
import java.util.Objects;

public class Manager extends Employee {
    private double coefficient;

    public Manager(String name, int experience, BigDecimal basePayment, double coefficient) {
        super(name, experience, basePayment);
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getExperience() {
        return super.getExperience();
    }

    @Override
    public BigDecimal getPayment() {
        return super.getPayment().multiply(BigDecimal.valueOf(coefficient));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getName(), employee.getName()) &&
                Objects.equals(getExperience(), employee.getExperience()) &&
                Objects.equals(getPayment(), employee.getPayment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getExperience(), getPayment());
    }

    @Override
    public String toString() {
        return "Manager{ name = " + getName() +
                ", coefficient=" + coefficient +
                '}';
    }
}
