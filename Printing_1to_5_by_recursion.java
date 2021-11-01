package com.debyanshu;

public class Printing_1to_5_by_recursion {
    public static void main(String[] args) {
        pa(1);
    }
    static void pa(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        pa(n+1);
    }
}
