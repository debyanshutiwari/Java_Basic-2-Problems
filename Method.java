package com.debyanshu;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Method {
    public static void main(String[] args) {
        String a="Debyanshu Tiwari";
        System.out.println(Arrays.toString(a.toCharArray()));// output is [D, e, b, y, a, n, s, h, u,  , T, i, w, a, r, i]
        System.out.println(a.toLowerCase());//output is debyanshu tiwari
        System.out.println(a.toUpperCase()); // output is DEBYANSHU  TIWARI
        System.out.println(a.length()); //output is  16 ...
        System.out.println(a.indexOf('a')); // output is 4
        System.out.println("    hellooo     ".strip()); //output is helloo ...strip() will remove space
    }
}
