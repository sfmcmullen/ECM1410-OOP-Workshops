public class ShapeApp {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("One and only one argument needed");
            System.exit(0);
        }

        char c = args[0].charAt(0);

        if (c == 'C' || c == 'c') {
            circleChoice();
        }
        else if (c == 'R' || c == 'r') {
            rectangleChoice();
        }
        else {
            System.out.println("Only support c, C or r, R as argument");
        }
    }

    public static void circleChoice()
    {
        Circle circle1 = new Circle(5.0, 2.0, 3.0);
        Circle circle2 = new Circle(3.0, 27.0, 5.0);

        // Creating a random factor to shrink circle1 between 0.5 and 1.0
        double factor = Math.random() * 0.5 + 0.5;
        // Creasting a random factor to grow circle2 between 1.0 and 2.0
        double factor2 = Math.random() + 1.0;

        // Integer to count the number of times the circles are zoomed
        int count = 0;

        // Repeatedly shrink circle1 and grow circle2 until they overlap
        while (!circle1.isOverlappedWith(circle2)) {
            count++;
            System.out.println("Current count: " + count);

            circle1.zoom(factor);
            circle2.zoom(factor2);

            System.out.println("Circle 1: " + circle1);
            System.out.println("Circle 2: " + circle2);

            System.out.println();
        }

        System.out.println("The circles overlap after " + count + " zooms.");
    }

    public static void rectangleChoice()
    {
        Rectangle rect1 = new Rectangle(20.0, 8.0);
        Rectangle rect2 = new Rectangle(10.0, 5.0, 25, 9);

        //Creating a random factor to move rect1 between -5 and 5
        double dx = Math.random() * 10 - 5;
        double dy = Math.random() * 10 - 5;
        // Creating a random factor to zoom rect2 between 1.0 and 2.0
        double factor = Math.random() + 1.0;

        // Integer to count the number of times the rectangles are moved and zoomed
        int count = 0;

        // Repeatedly move rect1 and zoom rect2 until they overlap
        // When zooming rect2, make sure ratio of width to height is within [1/4, 4]
        while (!rect1.isOverlappedWith(rect2)) {
            count++;
            System.out.println("Current count: " + count);

            rect1.move(dx, dy);
            rect2.zoom(factor);

            // If the ratio of width to height is not within [1/4, 4], undo the zoom and try again
            while (rect2.getRatio() < 0.25 || rect2.getRatio() > 4) {
                rect2.zoom(1 / factor);
                factor = Math.random() + 1.0;
                rect2.zoom(factor);
                System.out.println("Re-zoomed");
            }
            
            System.out.println("Rectangle 1: " + rect1);
            System.out.println("Rectangle 2: " + rect2);

            System.out.println();
        }

        System.out.println("The rectangles overlap after " + count + " moves and zooms");
    }
}
