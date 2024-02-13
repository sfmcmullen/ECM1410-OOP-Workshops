public class StringFormatApp {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Three inputs (name age height) are required");
            System.exit(0);
        }

        String name = args[0];
        int age = Integer.parseInt(args[1]);
        float height = Float.parseFloat(args[2]);

        System.out.println("Name: " + name + " Age: " + age + " Height: " + height);

        System.out.printf("Name: %15s%n Age: %3d%n Height: %.1f%n", name, age, height);

        String s = String.format("Name: %15s%n Age: %3d%n Height: %.1f%n", name, age, height); // Same as printf but returns a string
        System.out.println(s);

        
    }
}
