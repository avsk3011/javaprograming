public class Stringh_example {

    public static void main(String[] args) {
        // String msg =greet();
        //     System.out.println(msg);
        String personalised= myGreet( " Abhishek Pratap Singh");
        System.out.println(personalised);
    }
    static String myGreet( String name){
        String msg= "How are you " +name;
        return msg;
    }
    
}
