package com.company;

public class Main {

    public static void main(String[] args) {
        int [] array = {5,7,-2,1,-8,4,9,1};
        System.out.println("№6 Сумма элементов массива "+ summArrayElements(array));
    }
    public static int summArrayElements (int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            k=k+array[i];
        }
        return k;
    }
}
