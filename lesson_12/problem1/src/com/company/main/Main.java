package com.company.main;

import com.company.customer.Customer;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Muntasir", "Nizomidinovich", "Sohili 3", 41675327, 12);
        Customer customer1 = new Customer("Mansur", "N", "Sohili 3", 41675327, 18);
        Customer customer2 = new Customer("Mr1", "N2", "Sohili 3", 41675327, 7);
        //System.out.println(customer.getAdres());
        customer.setAdres("Sohili 3 h 13");



        Customer[] customers = new Customer [3];
        customers[0]=customer;
        customers[1]=customer1;
        customers[2]=customer2;


        for (int x=0; x<customers.length; x++) {
            if(customers[x].getId()%2==0){
                System.out.println(customers[x].getId()+"    "+customers[x].getName());
            }
        }
    }
}
