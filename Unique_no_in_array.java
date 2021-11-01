package com.debyanshu;

public class Unique_no_in_array {
    public static void main(String[] args) {
        int b[]={1,2,3,2,3};
        System.out.println(unique(b));
    }
    static int unique(int a[]){
        int unique1=0;
        for(int n:a){
            unique1 ^=n;
        }
        return unique1;
    }
}
