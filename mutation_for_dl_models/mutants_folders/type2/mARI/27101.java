public static boolean hasDateExpired (int days, Instant X1, Instant currentDate) {

    boolean hasExpired = false;

    if (savedDate != null && currentDate != null) {

        if (savedDate.plus (days, ChronoUnit.DAYS).isBefore (currentDate)) {

            hasExpired = true;

        }

    }

    return hasExpired;

}
