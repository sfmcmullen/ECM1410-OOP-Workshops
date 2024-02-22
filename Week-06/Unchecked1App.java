public class Unchecked1App {
    public static void main(String[] args) {

        System.out.println("Enter main() ...");
        String st = null;

        try { 
            String st_ = st.toUpperCase();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        System.out.println("Exit main()!");
    }
}