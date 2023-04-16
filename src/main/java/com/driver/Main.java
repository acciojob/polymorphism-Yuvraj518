package com.driver;

public class Main {
    public static void main(String args[]){
        Product p=new Product();
        p.product(3,4);
        p.product(3,4,5);
        p.product(1.2,1);
    }
    static class Product{
        public int product(int x,int y){
            System.out.println(x*y);
            return (x*y);
        }
        public int product(int x,int y,int z){
            System.out.println(x*y*z);
            return(x*y*z);
        }
        public double product(double x, double y){
            System.out.println(x*y);
            return (x*y);
        }
    }
}