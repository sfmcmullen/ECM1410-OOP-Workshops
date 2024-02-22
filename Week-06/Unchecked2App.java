public class Unchecked2App{
    public static void main(String args[]){
        System.out.println("Enter main() ...");
        String st = null;//later we’ll change it to null
        methodA(st);
        System.out.println("Exit main()!");
    }

    static void methodA(String st){
        System.out.println("Enter memthodA() ...");
        methodB(st);
        System.out.println("Exit methodA()!");
    }

    static void methodB(String st) {
        System.out.println("Enter methodB() ...");
        try {
            String st_ = st.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
        }
        System.out.println("Exit methodB()!");
    }
}