package com.debyanshu;

public class Sum_of_1st_5_number {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }

       return n+ (sum(n-1));

    }
}
