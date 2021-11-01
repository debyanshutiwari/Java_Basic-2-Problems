package com.debyanshu;

public class String_1_basics {
    public static void main(String[] args) {
        String a=new String("debyanshu"); // it is like creaking object
        String b=new String("debyanshu");
       System.out.println(a==b); // it will give false as output because a and b are pointing to different object



       System.out.println(a.equals(b)); //it will give true because it will check whether and b are having same value or not if not it will give false.


        System.out.println(a.charAt(5)); // it will give index value at 0 in a so output is : n
        
        System.out.println(b.charAt(7));//it will give index value at 7 in a so output is : h

    }
}
