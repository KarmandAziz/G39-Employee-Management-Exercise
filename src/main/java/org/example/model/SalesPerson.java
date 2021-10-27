package org.example.model;

import java.time.LocalDate;

public class SalesPerson extends Employee{

    private String[] clients;
    private int aquiredClients;

    public SalesPerson(int id, String name, double salary, LocalDate dateHired) {
        super(id, name, salary, dateHired);
    }


    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public int getAquiredClients() {
        return aquiredClients;
    }

    public void setAquiredClients(int aquiredClients) {
        this.aquiredClients = aquiredClients;
    }

    @Override
    public void calculateSalary() {

    }
}
