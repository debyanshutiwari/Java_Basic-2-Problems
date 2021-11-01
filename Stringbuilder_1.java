package com.debyanshu;

public class Stringbuilder_1 {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i <26 ; i++) {
            char a=(char)('a'+i);
           builder.append(a);
        }
          System.out.println(builder); //output is  abcdefghijklmnopqrstuvwxyz
       builder.deleteCharAt(0); // index value at 0 will be deleted
       System.out.println(builder);// output is bcdefghijklmnopqrstuvwxyz

        builder.reverse(); // it will give reverse order
        System.out.println(builder); //output is zyxwvutsrqponmlkjihgfedcba
    }
}
