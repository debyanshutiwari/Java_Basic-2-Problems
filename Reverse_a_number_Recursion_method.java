// output is 654321


public class Reverse_a_number_Recursion_method {
    public static void main(String[] args) {
        reverse(123456); // giving value

        System.out.println(sum);
    }
    static int sum=0 ;//it will be accessed every function

    static void reverse(int n){
        if(n==0){
            return;
        }
        int remainder=n%10; // it will give remainder value of n;

        sum=sum*10+remainder; // updating  sum

        reverse(n/10); // it will elminate last value after each step
    }


}
