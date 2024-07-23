public static void main (String [] args) {

    X1 calendar = X1.getInstance ();

    int countFirstSunday = 0;

    for (int year = 1901;

    year <= 2000; year ++) {

        for (int month = 0;

        month <= 11; month ++) {

            calendar.set (year, month, 1);

            if (calendar.get (X1.DAY_OF_WEEK) == X1.SUNDAY) {

                countFirstSunday ++;

            }

        }

    }

    System.out.println ("Sundays as the first of month: " + countFirstSunday);

}
