package org.example.model;

import java.time.LocalDate;

public class SystemDeveloper extends Employee{

    private String[] certificates;
    private String[] languages;

    public SystemDeveloper(int id, String name, double salary, LocalDate dateHired) {
        super(id, name, salary, dateHired);
    }


    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }


    @Override
    public void calculateSalary() {

    }
}
