package com.debyanshu;

public class Sum {
    static int sum(int ...arr){ // it will act like arrays
        int sum=0;
        for (int a:arr) {
            sum=sum+a;
        }
        return  sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(7,1,2)); // we can pass n no of values without making method again and again

        System.out.println(sum(1,5));
    }
}
