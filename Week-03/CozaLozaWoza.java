public class CozaLozaWoza
{
    public static void main(String[] args)
    {
        //Print numbers from 1 to 110 with 11 numbers per line
        int lowerbound = 1, upperbound = 110;
        for (int number = lowerbound; number <= upperbound; ++number)
        {
            //Print coza if number is divisible by 3
            if (number % 3 == 0)
            {
                System.out.print("Coza");
            }
            //Print loza if number is divisible by 5
            if (number % 5 == 0)
            {
                System.out.print("Loza");
            }
            //Print woza if number is divisible by 7
            if (number % 7 == 0)
            {
                System.out.print("Woza");
            }

            //Print the number if it is not divisible by 3, 5 and 7
            if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0)
            {
                System.out.print(number);
            }

            //Print a newline if number is divisible by 11; otherwise, print a space
            if (number % 11 == 0)
            {
                System.out.println();
            }
            else
            {
                System.out.print(" ");
            }
        }
    }
}
