package com.debyanshu;

public class _nature {
    static int sum( int n){
        int sum=0;
        for (int i = 0; i <=n ; i++) {
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
