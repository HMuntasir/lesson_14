package com.company;

public class Main {

    public static void main(String[] args) {
        String word = "Pogoda plokhaya";
        for (int i=0; i<word.length(); i++){
            if(word.charAt(word.length()-1)==word.charAt(i)) {
                System.out.println(i);
            }
        }
    }
}
