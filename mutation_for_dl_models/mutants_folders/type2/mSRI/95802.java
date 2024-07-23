public static String getDurationBreakdown (long X1) {

    if (X1 < 0) {

        throw new IllegalArgumentException ("Duration must be greater than zero!");

    }

    long days = TimeUnit.MILLISECONDS.toDays (X1);

    X1 -= TimeUnit.DAYS.toMillis (days);

    long hours = TimeUnit.MILLISECONDS.toHours (X1);

    X1 -= TimeUnit.HOURS.toMillis (hours);

    long minutes = TimeUnit.MILLISECONDS.toMinutes (X1);

    X1 -= TimeUnit.MINUTES.toMillis (minutes);

    long seconds = TimeUnit.MILLISECONDS.toSeconds (X1);

    StringBuilder sb = new StringBuilder (64);

    sb.append (days);

    sb.append (" Days ");

    sb.append (hours);

    sb.append (" Hours ");

    sb.append (minutes);

    sb.append (" Minutes ");

    sb.append (seconds);

    sb.append (" Seconds");

    return (sb.toString ());

}
