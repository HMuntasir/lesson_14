package com.company;

public class Main {

    public static void main(String[] args) {
        int a=2;
        int b=4;
        System.out.println("№3 Сумма квадратов "+sumOfSquares(a,b));
    }
    public static int sumOfSquares (int a, int b){
        int sum=0;
        while(a<=b){sum=sum+(a*a); a++;}
        return sum;
    }
}
