package com.firstapi;

public class Man extends People implements Voice {
    int num = 100;

    public Man(String name, String surname, String lastName, String dateBirthday, Boolean scars) {
        super(name, surname, lastName, dateBirthday, scars);
    }

    public void display(){
        System.out.println("Man class");
    }

    public void myMethod(){
        Man man = new Man("Sergey", "Saitkulov", "Maratovich", "19.03.1996", false);
        // Вызываем метод display() подкласса
        man.display();
        // Вызываем метод display() суперкласса
        super.display();
        // Выводим значение переменной num подкласса
        System.out.println("Значение переменной num в подклассе: " + man.num);
        // Выводим значение переменной num суперкласса
        System.out.println("Значение переменной num в суперклассе: " + super.num);

    }

    @Override
    public void saySomething() {
        System.out.println("Man say - Hello");
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
