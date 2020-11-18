package com.company;

public class Main {

    public static void main(String[] args) {
        String word = "Pogod";
        String array = word;
        int y=12-word.length();
        if(word.length()>10){
            array=word.substring(0,6);
            System.out.println(array);
        } else {
            for (int i=0; i<y; i++){
                array=array+'o';
            }
            System.out.println(array);
        }
    }
}
