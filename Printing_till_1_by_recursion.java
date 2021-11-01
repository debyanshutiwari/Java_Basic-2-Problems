package com.debyanshu;

public class Printing_till_1_by_recursion {
    public static void main(String[] args) {

    }
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);    // calling function again and again;

    }
}
