public static void main (String [] args) {

    int numberofDays;

    int sharePoints;

    Scanner keyboard = new Scanner (System.in);

    System.out.print ("Number of days in the period: ");

    numberofDays = keyboard.nextInt ();

    System.out.print ("Share points on the first day: ");


    numberofDays = validator (numberofDays, keyboard);

    outPutTablePrinter (numberofDays, sharePoints);

}
