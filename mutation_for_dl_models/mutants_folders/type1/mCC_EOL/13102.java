public static void main (String args []) {

    Scanner myScanner = new Scanner (System.in);

    double mon = getExpensesForDay (myScanner, "Monday");

    double tues = getExpensesForDay (myScanner, "Tuesday");

    double wed = getExpensesForDay (myScanner, "Wednesday"); // EOL Comment

    double thurs = getExpensesForDay (myScanner, "Thursday");

    double fri = getExpensesForDay (myScanner, "Friday");

    double sat = getExpensesForDay (myScanner, "Saturday");

    double sun = getExpensesForDay (myScanner, "Sunday");

}
