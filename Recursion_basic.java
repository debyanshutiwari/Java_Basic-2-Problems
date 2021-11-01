public class Recursion_basic {
    public static void main(String[] args) {
   messgage(); // message function is called then it will go inside it and run what is there then it will call message 1 then it go inside it and execute so on ---.

    }

    static void messgage() {
        System.out.println("hello debyanshu");
        messgage1();
    }

    static void messgage1() {
        System.out.println("hello debyanshu");

        messgage2();
    }

    static void messgage2() {
        System.out.println("hello debyanshu");
        messgage3();
    }

    static void messgage3() {
        System.out.println("hello debyanshu");
        messgage4();
    }

    static void messgage4() {
        System.out.println("hello debyanshu");
    }
}
