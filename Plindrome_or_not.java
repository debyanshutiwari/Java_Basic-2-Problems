package com.debyanshu;

public class Plindrome_or_not {
    public static void main(String[] args) {
        System.out.println(palindrome("abcba"));
    }
    static boolean palindrome(String n){
        for (int i = 0; i <n.length()/2 ; i++) {
            char start=n.charAt(i);// if i=0 then a  ,then i=1 is b ----
            char end=n.charAt(n.length()-1-i);//5-0=0 a then 5-1=4 is b ----
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
