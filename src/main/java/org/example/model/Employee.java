package org.example.model;

import java.time.LocalDate;

public abstract class Employee {
     //fields
    private int id;
    private String name;
    private double Salary;
    private LocalDate dateHired;

    public Employee(int id, String name, double salary, LocalDate dateHired) {
        this.id = id;
        this.name = name;
        Salary = salary;
        this.dateHired = dateHired;
    }

    public abstract void calculateSalary();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }
}
