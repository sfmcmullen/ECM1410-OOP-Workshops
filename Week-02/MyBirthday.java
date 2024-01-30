public class MyBirthday
{
    public static void main(String[] args)
    {
        int currentDate = 14;
        int currentDay = 1; // Sunday is 0, Monday is 1, ...

        final int DAYS_A_WEEK = 7; // final is used for declaring constants
        int myBirthdayDate = 29;
        int myBirthdayDay = (myBirthdayDate - currentDate) % DAYS_A_WEEK + currentDay;
        myBirthdayDay = myBirthdayDay % DAYS_A_WEEK;

        System.out.println(myBirthdayDay);
    }
}
