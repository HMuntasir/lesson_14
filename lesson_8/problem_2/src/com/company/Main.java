package com.company;

public class Main {

    public static void main(String[] args) {
        int x=10;
        int y=14;
        System.out.println("№2 Максимальный "+max(x,y));
    }
    public static int max (int x, int y){
        int max1=0;
        if(x>y){max1=x;} else {max1=y;}
        return max1;
    }
}
