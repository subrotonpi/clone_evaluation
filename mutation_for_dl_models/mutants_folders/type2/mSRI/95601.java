public static String getDurationBreakdown (long X1) {

    if (X1 < 0) {

        throw new IllegalArgumentException ("Duration must be greater than zero!");

    }

    long days = TimeUnit.MILLISECONDS.toDays (X1);

    long hours = TimeUnit.MILLISECONDS.toHours (X1) % 24;

    long minutes = TimeUnit.MILLISECONDS.toMinutes (X1) % 60;

    long seconds = TimeUnit.MILLISECONDS.toSeconds (X1) % 60;

    long milliseconds = X1 % 1000;

    return String.format ("%d Days %d Hours %d Minutes %d Seconds %d Milliseconds", days, hours, minutes, seconds, milliseconds);

}
