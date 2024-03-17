import shape.*;

public class MovableApp {
    public static void main (String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15); // upcast
        System.out.println(m1); // Equivalent to System.out.println(m1.toString());
        m1.moveLeft();
        m1.moveDown();
        System.out.println(m1);

        Shape m2 = new MovableCircle(1, 2, 3, 4, 20); // upcast
        System.out.println(m2); // Equivalent to System.out.println(m2.toString());
        m2.moveRight();
        System.out.println(m2);
        System.out.printf("Area:%.3f, Perimeter:%.3f%n", m2.area(), m2.perimeter()); // Works as upcasting Shape to MoveableCircle


    }
}