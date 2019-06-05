package com.firstapi;

import java.util.Random;

public abstract class People {  //abstract это класс- объект которого нельзя создать
    private String name;
    private String surname;
    private String lastName;
    private String dateBirthday;
    private Boolean scars;
    private int dnaCode;
    private Random random;
    int num = 10; // тестовая переменная для показания возможностей super

    public People(String name, String surname, String lastName, String dateBirthday, Boolean scars) {
        random = new Random();
        this.name = name;
        this.surname = surname;
        this.lastName = lastName;
        this.dateBirthday = dateBirthday;
        this.scars = scars;
        this.dnaCode = (random.nextInt(999 + 1) - random.nextInt(499 + 1) + random.nextInt(99999 + 1)) / 3;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateBirthday() {
        return dateBirthday;
    }

    public Boolean getScars() {
        return scars;
    }

    public int getDnaCode() {
        return dnaCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setScars(Boolean scars) {
        this.scars = scars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return dnaCode == people.dnaCode;
    }

    @Override
    public int hashCode() {
        return dnaCode;
    }

    @Override
    public String toString() {
        return  " Name= '"   +        name + '\'' +
                ", surname= '" +      surname + '\'' +
                ", lastName= '" +     lastName + '\'' +
                ", dateBirthday= '" + dateBirthday + '\'' +
                ", scars= " +         scars +
                ", dnaCode= " +       dnaCode;
    }

    public void display(){
        System.out.println("People class");
    }

    public abstract void eat(String food);
    public abstract void multiply();
    public abstract void goingToToilet();
}
