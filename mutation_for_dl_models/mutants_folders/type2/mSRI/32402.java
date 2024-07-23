public static void main (String [] args) {

    int numberofDays;

    int sharePoints;

    Scanner X1 = new Scanner (System.in);

    System.out.print ("Number of days in the period: ");

    numberofDays = X1.nextInt ();

    System.out.print ("Share points on the first day: ");

    sharePoints = X1.nextInt ();

    numberofDays = validator (numberofDays, X1);

    outPutTablePrinter (numberofDays, sharePoints);

}
