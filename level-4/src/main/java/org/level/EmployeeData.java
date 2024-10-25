package org.level;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class EmployeeData {
    private final String name;
    private final Map<String, WorkDay> workDays = new HashMap<>();
    private BigDecimal totalSalary;

    public EmployeeData(String name) {
        this.name = name;
        this.totalSalary = BigDecimal.ZERO;
    }

    public void addWorkDay(String date, double hours, BigDecimal salary) {
        WorkDay workDay = workDays.getOrDefault(date, new WorkDay(date));
        workDay.addHours(hours);
        workDay.addSalary(salary);
        workDays.put(date, workDay);
        totalSalary = totalSalary.add(salary);
    }

    public void printEmployeeReport() {
        System.out.println("Employee: " + name);
        workDays.values().forEach(WorkDay::printWorkDayReport);
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("---------------");
    }
}
