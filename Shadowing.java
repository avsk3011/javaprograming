public class Shadowing {
    static int x=20;
    public static void main(String[] args) {
        System.out.println(x);
        int x=40; // value of x makes show on line number 2 value of x
        System.out.println(x);
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
