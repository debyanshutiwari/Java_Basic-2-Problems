package com.debyanshu;

public class Bsic_recursion_for_printing_till5_using_recursion {
    public static void main(String[] args) {
print(1);
    }
    static void print(int n){
        if(n==5){ //if n=5 then print 5 and dont do anthing

            System.out.println(5); // printing 5

            return; // after printing 5 it wont call function again
        }
        System.out.println(n);
        print(n+1); // it will calling itself again and again
    }
}
