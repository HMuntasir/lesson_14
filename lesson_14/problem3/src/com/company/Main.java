package com.company;

public class Main {

    public static void main(String[] args) {
        String word = "Pogoda plokhaya";
        for (int i=0; i<word.length(); i++){
            if(word.charAt(i)=='x' || word.charAt(i)=='w') {
                System.out.println("Первым встречается символ "+word.charAt(i));
                break;
            }
        }
        if (!word.contains("x")){
            System.out.println("В строке нет символа Х");
        }
        if (!word.contains("w")){
            System.out.println("В строке нет символа W");
        }
    }
}
