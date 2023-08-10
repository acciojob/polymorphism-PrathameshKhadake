package com.driver;

public class Main {

    public static void main(String[] args){

        Product p = new Product();

        int prd1 = p.product(1, 2);

        int prd2 = p.product(1, 2, 3);

        double prd3 = p.product(2.0, 2.0);

    }

}