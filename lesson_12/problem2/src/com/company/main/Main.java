package com.company.main;

public class Main {

    public static void main(String[] args) {

        Subscriber subscriber=new Subscriber(12, "Hasanov", "Nizomidinovich", "Sohili 3", 3.15, false);
        Subscriber subscriber1=new Subscriber(8, "Yorova", "Nigina", "donish 5", 5.42, true);
        Subscriber subscriber2=new Subscriber(17, "Hudonazarova", "Hangoma", "Karaboev", 4.22, true);

        Subscriber[] subscribers=new Subscriber[3];
        subscribers[0]=subscriber;
        subscribers[1]=subscriber1;
        subscribers[2]=subscriber2;
        System.out.println("Городские разговоры");
        for (int i=0; i<subscribers.length; i++){
           if(subscribers[i].time>3.50 & subscribers[i].getCity()==true) {
               System.out.println("Id= "+subscribers[i].getId()+"  время разговора  "+subscribers[i].getTime()+"  абонент  "+subscribers[i].getOtchestvo());
           }
        }
        System.out.println("Междугородные разговоры");
        for (int i=0; i<subscribers.length; i++){
            if(subscribers[i].getCity()==false) {
                System.out.println("Id= "+subscribers[i].getId()+"  время разговора  "+subscribers[i].getTime()+"  абонент  "+subscribers[i].getOtchestvo());
            }
        }
    }
}
