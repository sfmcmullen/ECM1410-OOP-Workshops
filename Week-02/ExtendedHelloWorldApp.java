public class ExtendedHelloWorldApp
{
    public static void main(String[] args)
    {
        /*In terminal if you write 'java ExtendedHelloWorldApp.java _name_ _age_' 
        it will return a concatinated string with your args*/
        System.out.println("Hello World! I am " + args[0] + ". I am " + args[1] + " years old.");

        //The following code also does the same as the above, using print instead of println
        System.out.print("Hello World! I am ");
        System.out.print(args[0]);
        System.out.print(". I am ");
        System.out.print(args[1]);
        System.out.println(" years old.");
    }
}