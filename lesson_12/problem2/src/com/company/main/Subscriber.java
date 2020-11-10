package com.company.main;

public class Subscriber {
    public int Id;
    public String secondName;
    public String otchestvo;
    public String adress;
    public double time;
    public boolean city;

    public Subscriber(int Id, String secondName, String otchestvo, String adress, double time, boolean city){
        this.Id=Id;
        this.secondName=secondName;
        this.otchestvo=otchestvo;
        this.adress=adress;
        this.time=time;
        this.city=city;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public boolean getCity() {
        return city;
    }

    public void setCity(boolean city) {
        this.city = city;
    }


}
