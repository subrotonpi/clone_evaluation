public static void main (String args []) {

    Scanner myScanner = new Scanner (System.in);

    double mon = getExpensesForDay (myScanner);

    double tues = getExpensesForDay (myScanner, "Tuesday");

    double wed = getExpensesForDay (myScanner, "Wednesday");

    double thurs = getExpensesForDay (myScanner, "Thursday");

    double fri = getExpensesForDay (myScanner, "Friday");

    double sat = getExpensesForDay (myScanner, "Saturday");

    double sun = getExpensesForDay (myScanner, "Sunday");

}
