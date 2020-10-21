package com.company;

public class Main {

    public static void main(String[] args) {
        int [] array = {5,7,-2,1,-8,4,9,1};
        System.out.println("№4 Максимальный элемент в массиве "+maxInArray(array));
    }
    public static int maxInArray (int[] array){
        int max=0;
        for(int i=0; i<array.length; i++){if(max<array[i]){max=array[i];} }
        return max;
    }
}
