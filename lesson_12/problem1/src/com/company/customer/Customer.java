package com.company.customer;

public class Customer {
    private String name;
    private String otchestvo;
    private String adres;
    private int creditCardNumber;
    private int Id;
    public Customer(String name, String otchestvo, String adres, int creditCardNumber, int Id){
         this.name=name;
         this.otchestvo=otchestvo;
         this.adres=adres;
         this.creditCardNumber=creditCardNumber;
         this.Id=Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
