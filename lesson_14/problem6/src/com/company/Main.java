package com.company;

public class Main {

    public static void main(String[] args) {
        String word = "Pogodaw";
        String word1 = "plokhdawya";
        int counter=0;
        String result="";
        for(int i=0; i<word.length(); i++){
            for(int j=0; j<word1.length(); j++){
                if(word.charAt(i)==word1.charAt(j)){
                    result = result + word1.charAt(j);
                }
            }
        }
        for(int i=0; i<result.length(); i++){
            for(int j=0; j<result.length(); j++){
                if(i!=j && result.charAt(i)==result.charAt(j)){
                    counter++;
                }
            }
            if(counter==0) {
                System.out.print(result.charAt(i)+", ");
            }
            counter=0;
        }
    }
}
