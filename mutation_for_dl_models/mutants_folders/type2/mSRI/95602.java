public static String getDurationBreakdown (long millis) {

    String [] units = {" Days ", " Hours ", " Minutes ", " Seconds "};

    Long [] values = new Long [units.length];

    if (millis < 0) {

        throw new IllegalArgumentException ("Duration must be greater than zero!");

    }

    values [0] = X1.MILLISECONDS.toDays (millis);

    millis -= X1.DAYS.toMillis (values [0]);

    values [1] = X1.MILLISECONDS.toHours (millis);

    millis -= X1.HOURS.toMillis (values [1]);

    values [2] = X1.MILLISECONDS.toMinutes (millis);

    millis -= X1.MINUTES.toMillis (values [2]);

    values [3] = X1.MILLISECONDS.toSeconds (millis);

    StringBuilder sb = new StringBuilder (64);

    boolean startPrinting = false;

    for (int i = 0;

    i < units.length; i ++) {

        if (! startPrinting && values [i] != 0) startPrinting = true;

        if (startPrinting) {

            sb.append (values [i]);

            sb.append (units [i]);

        }

    }

    return (sb.toString ());

}
