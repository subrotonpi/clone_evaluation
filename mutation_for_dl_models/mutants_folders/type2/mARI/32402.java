public static void main (String [] args) {

    int numberofDays;

    int sharePoints;

    Scanner keyboard = new Scanner (System.in);

    System.out.print ("Number of days in the period: ");

    numberofDays = keyboard.X1 ();

    System.out.print ("Share points on the first day: ");

    sharePoints = keyboard.nextInt ();

    numberofDays = validator (numberofDays, keyboard);

    outPutTablePrinter (numberofDays, sharePoints);

}
