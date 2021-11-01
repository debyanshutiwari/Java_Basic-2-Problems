public class Number_is_Odd_or_Even {
    public static void main(String[] args) {
        int a=67;
        System.out.println(pattern(a));
    }
    static boolean pattern(int n){
        return (n & 1)==1; // check condition
    }
}
