package org.level;

import java.math.BigDecimal;

public class WorkDay {
    private final String date;
    private double totalHours;
    private BigDecimal totalSalary;

    public WorkDay(String date) {
        this.date = date;
        this.totalSalary = BigDecimal.ZERO;
    }

    public void addHours(double hours) {
        this.totalHours += hours;
    }

    public void addSalary(BigDecimal salary) {
        this.totalSalary = totalSalary.add(salary);
    }

    public void printWorkDayReport() {
        System.out.println("Date: " + date + ", Total Hours: " + totalHours + ", Total Salary: " + totalSalary);
    }
}
