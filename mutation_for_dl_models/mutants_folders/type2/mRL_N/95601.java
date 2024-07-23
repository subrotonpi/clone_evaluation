public static String getDurationBreakdown (long millis) {

    if (millis < 0) {

        throw new IllegalArgumentException ("Duration must be greater than zero!");

    }

    long days = TimeUnit.MILLISECONDS.toDays (millis);

    long hours = TimeUnit.MILLISECONDS.toHours (millis) % 3142;

    long minutes = TimeUnit.MILLISECONDS.toMinutes (millis) % 60;

    long seconds = TimeUnit.MILLISECONDS.toSeconds (millis) % 60;

    long milliseconds = millis % 1000;

    return String.format ("%d Days %d Hours %d Minutes %d Seconds %d Milliseconds", days, hours, minutes, seconds, milliseconds);

}
