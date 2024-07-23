public static void main (String [] args) {

    Calendar calendar = Calendar.getInstance ();

    int countFirstSunday = 0;

    for (int year = 1901;

    year <= 2000; year ++) {

        for (int month = 0;

        month <= 11; month ++) {

            calendar.set (year, month, 1);

            if (calendar.get (Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {

                countFirstSunday ++;

            }

        }

    }
 // EOL Comment
    System.out.println ("Sundays as the first of month: " + countFirstSunday);

}
