// output- 255[.]100[.]50[.]0

package com.debyanshu;

public class String_1part_2 {
    public static void main(String[] args) {
        System.out.println(str("255.100.50.0"));
    }
    static String  str(String n){
        String empty="";
        for (int i = 0; i <n.length() ; i++) {
            char a=n.charAt(i);
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
