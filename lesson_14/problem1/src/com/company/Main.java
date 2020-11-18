package com.company;

public class Main {

    public static void main(String[] args) {
        String word = "Pogoda plokhaya";
        if(word.length()>5){
            System.out.println(word.substring(0,3)+ "  "+ word.substring((word.length()-3)));
        } else {
            for (int i=0; i<word.length(); i++){
                System.out.println(word.charAt(0));
            }
        }
    }
}
