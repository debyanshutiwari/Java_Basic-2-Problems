// output -  1[.]1[.]1[.]1
package com.debyanshu;

public class String_1 {
    public static void main(String[] args) {
        System.out.println(String1("1.1.1.1"));
    }
    static String String1(String n){
        String empty="";
        for (int i = 0; i <n.length() ; i++) {
            char a=n.charAt(i); // here it return character value at index
            if (a == '.') {
                empty=empty+"[.]";

            }
            else{
                empty=empty+a;
            }
        }
        return empty;
    }
}
