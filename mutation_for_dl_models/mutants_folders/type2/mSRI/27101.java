public static boolean hasDateExpired (int X1, Instant savedDate, Instant currentDate) {

    boolean hasExpired = false;

    if (savedDate != null && currentDate != null) {

        if (savedDate.plus (X1, ChronoUnit.DAYS).isBefore (currentDate)) {

            hasExpired = true;

        }

    }

    return hasExpired;

}
