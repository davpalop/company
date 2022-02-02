package org.iesfm.company;

import java.util.Objects;

public class Employee {

    private String nif;
    private String name;
    private String surname;
    private String role;
    private String department_name;

    public Employee(String nif, String name, String surname, String role, String department_name) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.department_name = department_name;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getNif(), employee.getNif()) && Objects.equals(getName(), employee.getName()) && Objects.equals(getSurname(), employee.getSurname()) && Objects.equals(getRole(), employee.getRole()) && Objects.equals(getDepartment_name(), employee.getDepartment_name());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNif(), getName(), getSurname(), getRole(), getDepartment_name());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", role='" + role + '\'' +
                ", department_name='" + department_name + '\'' +
                '}';
    }
}
