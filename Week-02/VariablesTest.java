public class VariablesTest
{
    public static void main(String[] args)
    {
        //Part1();

        Part2();
    }

    public static void Part1()
    {
        /* Original statements - Find which ones would work or not:

        1. float area = 20.3F, radius;
            Valid
        2. char a = '\u5468', b = '\\';
            Valid
        3. byte nCount = 30*21;
            Invalid, as exceeds range of byte data type (-128 to 127)
        4. int nHours = 022;
            Valid, but will create an octal number due to starting '0'
        5. double ratio = 7/5;
            Valid, but won't assign 1.4, it will assign 1.0, due to 7/5=1
        */

        // Fixed Statements
        float area = 20.3F, radius = 7.2f;
        char a = '\u5468', b = '\\';
        short nCount = (30*21);
        int nHours = 22;
        double ratio = 7.0/5.0;
        //Printing values in varaibles
        System.out.println(area + " and " + radius);
        System.out.println(a + " and " + b);
        System.out.println(nCount);
        System.out.println(nHours);
        System.out.println(ratio);
    }

    public static void Part2()
    {
        //Demonstarting Rounding Errors
        double d = 29.0;
        double dOld = d;
        System.out.println(d);

        d *= 0.01;
        System.out.println(d);

        d /= 0.01;
        System.out.println(d);
        double dNew = d;
        //Should be equivalent to 29.0 as it's been * and / by 0.01

        //The correct method is using the following, where epsilon is a small number
        //if (Math.abs(dOld - dNew) < epsilon) { ... }
        if (Math.abs(dOld - dNew) < 1e-10)
        {
            System.out.println("Equivalent");
        }
    }
}
