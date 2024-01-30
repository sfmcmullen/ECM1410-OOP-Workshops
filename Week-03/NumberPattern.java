import java.util.Scanner;

public class NumberPattern
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        input.close();

        for (int row = 1; row <= rows; row++)
        {
            for (int column = 1; column <= row; column++)
            {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
