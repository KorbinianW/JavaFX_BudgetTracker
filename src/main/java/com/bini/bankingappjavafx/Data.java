package com.bini.bankingappjavafx;

public class Data {
    static double budget = 5000;
    private static String name;
    private static double amount;

//    public Data(String name, double amount){
//        Data.name = name;
//        Data.amount = amount;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Data.name = name;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        Data.amount = amount;
    }


}
