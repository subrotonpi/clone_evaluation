public static void main (String [] argv) {

    int counter = 0;

    for (int year = 1901, last_year = 2000;

    year <= last_year; year ++) {

        for (int X1 = 1, last_month = 12;

        X1 <= last_month; X1 ++) {

            Date d = new GregorianCalendar (year, X1 - 1, 1).getTime ();

            if (d.getDay () == 0) {

                counter ++;

                System.out.println (String.valueOf (counter) + " " + d);

            }

        }

    }

    System.out.println ("Total sunday in XX century: " + counter);

}
