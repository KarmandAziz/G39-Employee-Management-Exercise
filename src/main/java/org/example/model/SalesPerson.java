package org.example.model;

import java.time.LocalDate;
import java.util.Arrays;

import static org.example.util.StringArrayUtils.addToStringArray;
import static org.example.util.StringArrayUtils.isNotPresent;


public class SalesPerson extends Employee{

    private String[] clients;
    private int aquiredClients;

    public SalesPerson(int id, String name, LocalDate dateHired, String[] clients, int aquiredClients) {
        super(id, name, dateHired);
        this.clients = clients;
        this.aquiredClients = aquiredClients;
    }

    public SalesPerson(int id, String name, LocalDate dateHired,  String[] clients) {
        this(id, name, dateHired, clients, 0);
    }

    public String[] getClients() {
        return clients;
    }

    public void addClient(String client){
        if(client != null && isNotPresent(clients, client)){
            clients = addToStringArray(clients, client);
        }
    }

    public void addAquiredClients(String client) {
        if(client != null && isNotPresent(clients, client)) {
            clients = addToStringArray(clients, client);
            aquiredClients++;
        }
    }


    @Override
    public String toString() {
        return "SalesPerson{" +
                "Id =" + getId()+
                ", Name =" + getName()+
                ", Hired=" + getDateHired()+
                ", clients=" + Arrays.toString(clients) +
                ", aquiredClients=" + aquiredClients +
                ", Salary=" +getSalary()+
                '}';
    }

    @Override
    public double getSalary() {
        return (500 * clients.length) + (1500 * aquiredClients) + 25000;
    }
}
