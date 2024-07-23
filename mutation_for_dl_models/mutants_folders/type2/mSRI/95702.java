public static String getDurationBreakdown (long millis) {

    if (millis < 0) {

        throw new IllegalArgumentException ("Duration must be greater than zero!");

    }

    long days = TimeUnit.X1.toDays (millis);

    millis -= TimeUnit.DAYS.toMillis (days);

    long hours = TimeUnit.X1.toHours (millis);

    millis -= TimeUnit.HOURS.toMillis (hours);

    long minutes = TimeUnit.X1.toMinutes (millis);

    millis -= TimeUnit.MINUTES.toMillis (minutes);

    long seconds = TimeUnit.X1.toSeconds (millis);

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
