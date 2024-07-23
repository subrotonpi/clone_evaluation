public static void main (String [] args) {

    Scanner keyboard = new Scanner (System.in);

    System.out.print ("Number of days in the period: ");

    numberofDays = keyboard.nextInt ();

    System.out.print ("Share points on the first day: ");

    sharePoints = keyboard.nextInt ();

    while (numberofDays < 10 || numberofDays > 20) {

        System.out.println ("The number of days doesn’t meet the required criteria, enter it again");

        System.out.print ("Number of days in the period: ");

        numberofDays = keyboard.nextInt ();

    }

    DisplayStock (X1);

}
