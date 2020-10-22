package com.company;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.grade="Хубони";
        apple.colour="Красный";
        apple.sour=false;
        System.out.println("Сорт = "+apple.grade);
        System.out.println("Цвет = "+apple.colour);
        System.out.println("Кислое = "+apple.sour);

        Apple apple1 = new Apple();
        apple1.grade="Семеренко";
        apple1.colour="Зелёный";
        apple1.sour=true;
        System.out.println("Сорт = "+apple1.grade);
        System.out.println("Цвет = "+apple1.colour);
        System.out.println("Кислое = "+apple1.sour);


    }
}
class Apple{
    String grade;
    String colour;
    boolean sour;
}
