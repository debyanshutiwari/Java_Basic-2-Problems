// sample output
//1 false
//2 true
//3 true
//4 false
//5 true  etc
//  number which are divisble by 36 are true remaining false

package com.debyanshu;

public class IsPrime {
    public static void main(String[] args) {
        int n=36;
        for (int i = 1; i <=n ; i++) {
            System.out.println(i+ " "+prime(i));
        }
    }
    static boolean prime(int n){
        if(n<=1){ // because 1 is neither prime nor composite
            return false;
        }
        int number=2;  // from here number start for divison
        while(number*number<=n){
            if(n%number==0){
                return false;
            }
            number++;
        }
        return true;
    }
}
