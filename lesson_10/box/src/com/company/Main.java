package com.company;

public class Main {

    public static void main(String[] args) {
      Box box = new Box();
      box.height = 0.45;
      box.width = 0.8;
      box.material = "Бумага";
      box.weight = 0.4;
        System.out.println("Высота = " + box.height);
        System.out.println("Ширина = " + box.width);
        System.out.println("Материал = " + box.material);
        System.out.println("Вес = " + box.weight);

        Box box1 = new Box();
        box1.height = 5;
        box1.width = 3;
        box1.material = "Пластмасса";
        box1.weight = 2.5;
        System.out.println("Высота = " + box1.height);
        System.out.println("Ширина = " + box1.width);
        System.out.println("Материал = " + box1.material);
        System.out.println("Вес = " + box1.weight);
    }


}
    class Box {
    double height;
    double width;
    String material;
    double weight;

}