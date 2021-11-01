// output is 1
//           2
//           3
//           4
//           5

package com.debyanshu;

public class Numberexample_in_recursion {
    public static void main(String[] args) {
       number(1); // number fuction is called then it goes inside it and ececute it then it call number1 and then it go inside number1 and execute all command and call another function ...so on...



    }
    static void number(int n) { //function is calling another function
        System.out.println(n);
        number1(2);
    }
    static void number1(int n) {
        System.out.println(n);
        number2(3);
    }
    static void number2(int n) {
        System.out.println(n);
        number3(4);
    }
    static void number3(int n) {
        System.out.println(n);
        number4(5);
    }
    static void number4(int n) {
        System.out.println(n);
    }

}
