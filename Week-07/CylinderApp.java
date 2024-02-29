public class CylinderApp {
    @SuppressWarnings("static-access") // Suppresses the warning for the static access of the main method
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println("Radius is " + cy1.getRadius()
            + "\n Height is " + cy1.getHeight()
            + "\n Color is " + cy1.getColor()
            + "\n Base area is " + cy1.getArea()
            + "\n Volume is " + cy1.getVolume());

        Cylinder cy2 = new Cylinder(5.0, 2.0);
        System.out.println("Radius is " + cy2.getRadius()
            + "\n Height is " + cy2.getHeight()
            + "\n Color is " + cy2.getColor()
            + "\n Base area is " + cy2.getArea()
            + "\n Volume is " + cy2.getVolume());

        Cylinder cy3 = new Cylinder(3.0, 4.0, "green");
        cy3.printClassInfo();
    }
}
