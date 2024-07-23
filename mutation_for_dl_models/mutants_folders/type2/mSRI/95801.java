public static String getDurationBreakdown (long millis) {

    String [] units = {" Days ", " Hours ", " Minutes ", " Seconds "};

    Long [] values = new Long [units.length];

    if (millis < 0) {

        throw new IllegalArgumentException ("Duration must be greater than zero!");

    }

    values [0] = TimeUnit.MILLISECONDS.toDays (millis);

    millis -= TimeUnit.DAYS.toMillis (values [0]);

    values [1] = TimeUnit.MILLISECONDS.toHours (millis);

    millis -= TimeUnit.HOURS.toMillis (values [1]);

    values [2] = TimeUnit.MILLISECONDS.toMinutes (millis);

    millis -= TimeUnit.MINUTES.toMillis (values [2]);

    values [3] = TimeUnit.MILLISECONDS.toSeconds (millis);

    StringBuilder sb = new StringBuilder (64);

    boolean startPrinting = false;

    for (int X1 = 0;

    X1 < units.length; X1 ++) {

        if (! startPrinting && values [X1] != 0) startPrinting = true;

        if (startPrinting) {

            sb.append (values [X1]);

            sb.append (units [X1]);

        }

    }

    return (sb.toString ());

}
