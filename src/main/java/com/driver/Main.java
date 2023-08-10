package com.driver;

import java.sql.SQLOutput;

public class Main {

    Product p = new Product(); // Task-2: Object of product called P

    int ans1 = p.product(1, 2); // Task-3: call this method using Product class p
    int ans2  = p.product(1, 2, 3); // Task-4: call this method using Product class p
    double ans3 = p.product(2.0, 2.0); // Task-5: call this method using Product class p

//    System.out.println(ans1);
//    System.out.println(ans2);
//    System.out.println(ans3);




    static class Product{ // Task-1: class of Product
        public static int product(int x, int y){ // Task-3: create a method of product(int x, int y)
            return x * y;
        }

        public static int product(int x, int y, int z){ //Task-4: create a method of product(int x, int y, int z)
            return x * y * z;
        }

        public static double product(double x, double y){ //Task-5: create a method of product(double x, double y)
            return x * y;
        }

    }



}