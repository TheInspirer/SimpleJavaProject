package com.firstapi;

public class Woman extends People implements Voice{

    public Woman(String name, String surname, String lastName, String dateBirthday, Boolean scars) {
        super(name, surname, lastName, dateBirthday, scars);
    }

    @Override
    public void saySomething() {
        System.out.println("Woman say - Hi");
    }

    @Override
    public void eat(String food) {

    }

    @Override
    public void multiply() {

    }

    @Override
    public void goingToToilet() {

    }
}
