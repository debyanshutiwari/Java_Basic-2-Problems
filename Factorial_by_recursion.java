package com.debyanshu;

public class Factorial_by_recursion {
    public static void main(String[] args) {
        System.out.println(amit(5));
    }
    static int amit(int n){
        if(n==1){
            return 1;
        }

       return n* (amit(n-1));

    }
}
