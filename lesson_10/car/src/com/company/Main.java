package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.model="Таёта";
        car.colour="Белый";
        car.hp=180;
        car.sports=false;
        System.out.println("Модель = "+car.model);
        System.out.println("Цвет = "+car.colour);
        System.out.println("Лошадиные силы = "+car.hp);
        System.out.println("Спортивная = "+car.sports);
    }
}
class Car{
    String model;
    String colour;
    int hp;
    boolean sports;
}