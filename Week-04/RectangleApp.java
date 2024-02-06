// An application to create and manipulate rectangles

public class RectangleApp {
	//To be excutable, need a main method
	public static void main( String[] args ) {
		Rectangle myRect;//myRect is not instantiated
		myRect = new Rectangle(20.0, 8.0);//instantiated
		//static field
		System.out.println("Any rectangle has " + Rectangle.NUMBER_OF_SIDES + " sides");
		//instance fields
		System.out.println("myRect's origin: "+myRect.getOriginX()+","+myRect.getoriginY());
		//calling methods
		System.out.println("Area: "+myRect.getArea());
		//Moving the rectangle
		myRect.move(2,10);//the object's state is changed
		System.out.println("The origin moves to: "+myRect.getOriginX()+","+myRect.getoriginY());

		//Second rectangle
		Rectangle rect1 = new Rectangle(10.0, 5.0, 25, 9);
		//Testing the zoom method with single factor
		System.out.println("The area of the second rectangle before zooming by factor 2.0: "+rect1.getArea());
		rect1.zoom(2.0);
		System.out.println("The area of the second rectangle after zooming: "+rect1.getArea());
		//Testing the zoom method with two factors
		System.out.println("The area of the second rectangle before zooming by factors (1.0, 2.0): "+rect1.getArea());
		rect1.zoom(1.0, 2.0);
		System.out.println("The area of the second rectangle after zooming: "+rect1.getArea());

		//Testing the overlap method
		boolean overlap = myRect.isOverlappedWith(rect1);
		System.out.println("Do the two rectangles overlap? "+overlap);
		//Output: Do the two rectangles overlap? false (They border each other, but do not overlap)
		boolean overlap2 = rect1.isOverlappedWith(myRect);
		System.out.println("Do the two rectangles overlap? "+overlap2);
		//Output: Do the two rectangles overlap? false (They border each other, but do not overlap)
		//These bool values should always be the same, as the method is symmetric

		//Making a square
		Rectangle square = new Rectangle(5.0, 5.0);
		//Testing the getRatio method
		System.out.println("The ratio of the square: "+square.getRatio());
		//Output: The ratio of the square: 1.0
		//Testing the isSquare method
		boolean isSquare = square.isSquare();
		System.out.println("Is the square a square? "+isSquare);
		//Output: Is the square a square? true


		Rectangle rect2 = new Rectangle(10.0, 5.0);
		Rectangle rect3 = new Rectangle(10.0, 5.0);
		Rectangle rect4 = rect3;

		System.out.println("rect2: " + rect2);
		System.out.println("rect3: " + rect3);
		System.out.println("rect4: " + rect4);

		rect3.zoom(0.5);
		System.out.println("rect3 width after zooming: " + rect3.getWidth());
		System.out.println("rect4 width after zooming rect3: " + rect4.getWidth());
	}
}
