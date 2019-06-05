package com.firstapi;

public class GetInfoAboutUsers {

    public static void main(String[] args) {
        Man a = new Man("Dmitry", "Morozov", "Faievich", "19.03.1996", true);
        Man b = new Man("Sergey", "Saitkulov", "Maratovich", "19.03.1996", true);
        Woman c = new Woman("Eliza", "Nikolaeva", "Aleks", "19.03.1996", true);
        Woman d = new Woman("Elvina", "Sabirova", "Ulyzovna", "19.03.1996", true);

        System.out.println(a.toString());
        //a.myMethod(); //Показывает возможности конструкции super - методы, super - переменные
        a.saySomething();
        c.saySomething();
    }
}
