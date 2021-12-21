package com.example.java8;

import java.util.EnumMap;

public class Employee{
    private Integer empNumber;
    private String name;
    private Long sal;
    private String type;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Integer getEmpNumber() {
        return empNumber;
    }

    public String getName() {
        return name;
    }

    public Long getSal() {
        return sal;
    }

    public Long getSal(String a) {
        return sal;
    }

    public String getType() {
        return type;
    }

    public void setEmpNumber(Integer empNumber) {
        this.empNumber = empNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(Long sal) {
        this.sal = sal;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Employee [empNumber=" + empNumber + ", name=" + name + ", sal=" + sal + ", type=" + type + "]";
    }

    public boolean predicate(int a) {
        return this.empNumber>1;
    }

    public int biFn(Employee e2){
        return this.getSal().intValue()-e2.getSal().intValue();
    }


}