public class SumAverageInt
{
    public static void main(String[] args)
    {
        //usingForLoop();
        //usingWhileLoop();
        usingDoWhileLoop();
    }

    public static void usingForLoop()
    {
        // Define variables
        int sum = 0; // The accumulated sum, init to 0
        double average; // average in double
        int lowerbound = 1;
        int upperbound = 100;

        // Use a for-loop to sum from lowerbound to upperbound
        for (int number = lowerbound; number <= upperbound; ++number)
        {
            sum += number; // same as "sum = sum + number"
        }

        // Compute average in double. Beware that int/int produces int!
        average = sum / (upperbound - lowerbound + 1);

        // Print sum and average
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }

    public static void usingWhileLoop()
    {
        // Define variables
        int sum = 0; // The accumulated sum, init to 0
        double average; // average in double
        int lowerbound = 1;
        int upperbound = 100;

        // Use a while-loop to sum from lowerbound to upperbound
        int number = lowerbound;
        while (number <= upperbound)
        {
            sum += number; // same as "sum = sum + number"
            ++number;
        }

        // Compute average in double. Beware that int/int produces int!
        average = sum / (upperbound - lowerbound + 1);

        // Print sum and average
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }

    public static void usingDoWhileLoop()
    {
        // Define variables
        int sum = 0; // The accumulated sum, init to 0
        double average; // average in double
        int lowerbound = 1;
        int upperbound = 100;

        // Use a do-while-loop to sum from lowerbound to upperbound
        int number = lowerbound;
        do
        {
            sum += number; // same as "sum = sum + number"
            ++number;
        } while (number <= upperbound);

        // Compute average in double. Beware that int/int produces int!
        average = sum / (upperbound - lowerbound + 1);

        // Print sum and average
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}
