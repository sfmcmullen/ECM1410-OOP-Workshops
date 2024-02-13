public class StringCompareApp {
    public static void main(String[] args){
        String s1 = new String("book");
        String s2 = "book";
        String s3 = "book";

        System.out.println("s1==s2:"+(s1==s2)); //Compares the memory address of the two objects
        System.out.println("s2==s3:"+(s2==s3));
        System.out.println("s1.equals(s2):"+s1.equals(s2)); //Compares the content of the two objects
        System.out.println("s2.equals(s3):"+s2.equals(s3));

        //Doesn't change the original string
        String s4 = "Java 8.0";
        s4.replace('8','9');
        System.out.println("s: "+s4);

        //Changes the original string
        String s5 = "Java 8.0";
        String s5_new=s5.replace('8','9');
        System.out.println("s_new: "+s5_new);

        //Using string buffer
        StringBuffer sb = new StringBuffer("Java 8.0"); //StringBuffer is mutable
        sb.replace(5,6,"9"); //Replace the character at index 5 with 9
        System.out.println("sb: "+sb);

        //Using string builder
        StringBuilder sb2 = new StringBuilder("Java 8.0"); //StringBuilder is mutable
        sb2.replace(5,6,"9"); //Replace the character at index 5 with 9
        System.out.println("sb2: "+sb2);
    }
}
