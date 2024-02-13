import java.util.ArrayList;

class BookAuthorApp {
    public static void main(String[] args) {
        //TestAuthorClass(); // Uncomment to test Author class
        //TestBookClass(); // Uncomment to test Book class

        ArrayList<Book> books = new ArrayList<Book>(); // Create an ArrayList of Books
        books = createBooks(); // Create the books

        //#region Task 1: Decrease the quantity of the book "Making Software" by 1

        System.out.println("Task 1: Decrease the quantity of the book \"Making Software\" by 1");

        // Print the books before decreasing the quantity
        for (Book book : books) {
            System.out.println(book); // toString()
        }

        //Find book with title "making software"
        int bookIndex = findBook(books, "Making Software");
        if (bookIndex != -1) { // Book found, so decrease quantitiy by 1
            books.get(bookIndex).setQty(books.get(bookIndex).getQty() - 1);
            System.out.println("Book found and quantity decreased by 1");
        } else { // Book not found
            System.out.println("Book not found");
        }

        // Print the books after decreasing the quantity
        System.out.println();
        for (Book book : books) {
            System.out.println(book); // toString()
        }
        //#endregion
        
        System.out.println("\n\n"); // Add some space between tasks

        //#region Task 2: Find all books with "java" in the name and remove them from the list

        System.out.println("Task 2: Find all books with \"java\" in the name and remove them from the list");

        // Print the books before removing the books with "java" in the name
        for (Book book : books) {
            System.out.println(book); // toString()
        }

        // Find all books with "java" in the name and remove them from the list
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().toLowerCase().contains("java")) {
                books.remove(i);
                i--; // Decrement i because the size of the list has decreased by 1
            }
        }

        // Print the books after removing the books with "java" in the name
        System.out.println();
        for (Book book : books) {
            System.out.println(book); // toString()
        }

        //#endregion
    
        System.out.println("\n\n"); // Add some space between tasks

        //#region Task 3: Print remaining books

        System.out.println("Task 3: Print remaining books");

        // Print the remaining books
        for (Book book : books) {
            System.out.println(book); // toString()
        }

        //#endregion
    }

    public static int findBook(ArrayList<Book> books, String title) {
        int index = 0;
        for (Book book : books) {
            if (book.getName().equals(title)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static ArrayList<Book> createBooks() {
        ArrayList<Book> books = new ArrayList<Book>(); // Create an ArrayList of Book

        // Instantiate the authors
        Author robertNisbet = new Author("Robert Nisbet", "robertNisbet@gmail.com", 'm');
        Author wernerHeisenberg = new Author("Werner Heisenberg", "wernerHeisenberg@gmail.com", 'm');
        Author andyOram = new Author("Andy Oram", "andyOram@gmail.com", 'm');
        Author jamesNino = new Author("James Nino", "jamesNino@gmail.com", 'm');
        Author frederickHosch = new Author("Frederick Hosch", "frederickHosch@gmail.com", 'm');
        Author davidBarnes = new Author("David Barnes", "davidBarnes@gmail.com", 'm');
        Author michaelKolling = new Author("Michael Kolling", "michaelKolling@gmail.com", 'm');

        // Instantiate the books
        Author[] book1Authors = {robertNisbet};
        Book book1 = new Book("Data Mining Handbook", book1Authors, 27.95, 10);
        books.add(book1);

        Author[] book2Authors = {wernerHeisenberg};
        Book book2 = new Book("Physics & Philosophy", book2Authors, 40.35, 4);
        books.add(book2);

        Author[] book3Authors = {andyOram};
        Book book3 = new Book("Making Software", book3Authors, 35.00, 5);
        books.add(book3);

        Author[] book4Authors = {jamesNino, frederickHosch};
        Book book4 = new Book("OO Design Using Java", book4Authors, 30.00, 6);
        books.add(book4);

        Author[] book5Authors = {davidBarnes, michaelKolling};
        Book book5 = new Book("Objects First with Java", book5Authors, 29.50, 4);
        books.add(book5);

        return books;
    }

    public static void TestAuthorClass()
    {
        // Test the constructor and methods
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');

        System.out.println(ahTeck); // Test toString()
        ahTeck.setEmail("paulTan@nowhere.com"); // Test setter
        System.out.println("name is: " + ahTeck.getName()); // Test getter
        System.out.println("eamil is: " + ahTeck.getEmail()); // Test getter
        System.out.println("gender is: " + ahTeck.getGender()); // Test getter

        System.out.println("\n\n"); // Add some space between tasks
    }

    public static void TestBookClass()
    {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        // Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        
        // Test Book's methods
        System.out.println(javaDummy); // toString()

        // Test Getters and Setters
        javaDummy.setPrice(29.95);
        javaDummy.setQty(28);
        System.out.println("name is: " + javaDummy.getName());
        System.out.println("price is: " + javaDummy.getPrice());
        System.out.println("qty is: " + javaDummy.getQty());
        System.out.println("The authors are: " + javaDummy.getAuthorNames());

        System.out.println(javaDummy); // toString() after changes

        System.out.println("\n\n"); // Add some space between tasks
    }
}
