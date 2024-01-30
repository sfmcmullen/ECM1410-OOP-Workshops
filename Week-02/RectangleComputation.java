public class RectangleComputation
{
    public static void main(String[] args)
    {
        //Pass width and height as args when running program
        double height = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);

        double area = width * height;
        double perimeter = 2 * width + 2 * height;
        System.out.println("For a rectangle of dimensions " + width + " x " + height + ":");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        double ratio = height/width;

        System.out.println((ratio == 1.0) ? "Square" : "Not Square");
    }
}
