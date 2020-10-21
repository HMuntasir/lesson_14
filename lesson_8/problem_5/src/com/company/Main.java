package com.company;

public class Main {

    public static void main(String[] args) {
        int [] array = {5,7,-2,1,-8,4,9,1};
        int [] array3 = delArrayElements(array);
        System.out.print("№5 Положительные элементы массива ");
        for(int i=0; i<array3.length; i++){
            System.out.print(array3[i]+" ");}
        System.out.println();
    }
    public static int [] delArrayElements (int[] array){
        int k=0;
        for(int i=0; i<array.length; i++){
            if(array[i]<0){
                k++;
            }
        }
        int [] array1 = new int[array.length-k];
        int x = 0;
        for(int j=0; j<array.length; j++){
            if(array[j]>0){
                array1[x]=array[j];
                x++;
            }
        }
        return array1;
    }

}
