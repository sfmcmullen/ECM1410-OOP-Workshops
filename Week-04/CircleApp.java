public class CircleApp {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0, 2.0, 3.0);
        Circle circle2 = new Circle(3.0, 4.0, 5.0);

        //Testing all Circle methods
        System.out.println("The area of the first circle: " + circle1.getArea());
        System.out.println("The circumference of the first circle: " + circle1.getCircumference());
        System.out.println("The origin of the first circle: " + circle1.getOriginX() + ", " + circle1.getoriginY());
        circle1.move(1.0, 1.0);
        System.out.println("The origin of the first circle after moving: " + circle1.getOriginX() + ", " + circle1.getoriginY());
        System.out.println("The radius of the first circle before zooming: " + circle1.getRadius());
        circle1.zoom(2.0);
        System.out.println("The radius of the first circle after zooming: " + circle1.getRadius());
        System.out.println("The first circle: " + circle1);
        System.out.println("The second circle: " + circle2);
        System.out.println("Do the two circles overlap? " + circle1.isOverlappedWith(circle2));
        
    }
}
