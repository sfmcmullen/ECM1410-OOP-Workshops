public class OperatorsTest
{
    public static void main (String[] args)
    {
        //#region x++ vs ++x
        //Increments a after the assigment to b
        int a = 4;
        int b = a++ +7;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        //Increments a before the assigment to b
        a = 4;
        b = ++a +7;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        //#endregion

        //#region Ternary Operator

        /* Original if statement

        double x = -2.0;
        double y;
        if (x > 1)
        {
            y = x-1;
        }
        else
        {
        y = 0;
        }
        System.out.println("y = " + y);
        */

        // Statement remade using ternary operator
        double x = -2.0;
        double y = (x > 1) ? x-1 : 0;
        System.out.println("y = " + y);

        //#endregion
    }
}
