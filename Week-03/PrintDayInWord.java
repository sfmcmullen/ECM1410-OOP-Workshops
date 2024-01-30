class PrintDayInWord
{
    public static void main(String[] args)
    {
        //Set the value of the day
        int dayNumber = 2;

        //Using nested if
        if (dayNumber == 0)
        {
            System.out.println("Monday");
        }else if (dayNumber == 1){
            System.out.println("Tuesday");
        }else if (dayNumber == 2){
            System.out.println("Wednesday");
        }else if (dayNumber == 3){
            System.out.println("Thursday");
        }else if (dayNumber == 4){
            System.out.println("Friday");
        }else if (dayNumber == 5){
            System.out.println("Saturday");
        }else if (dayNumber == 6){
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid Day");
        }

        //Using switch statements
        switch (dayNumber) {
            case 0:
            System.out.println("Monday");
                break;
            case 1:
            System.out.println("Tuesday");
                break;
            case 2:
            System.out.println("Wednesday");
                break;
            case 3:
            System.out.println("Thursday");
                break;
            case 4:
            System.out.println("Friday");
                break;
            case 5:
            System.out.println("Saturday");
                break;
            case 6:
            System.out.println("Sunday");
                break;
            default:
            System.out.println("Invalid Day");
                break;
        }
    }
}