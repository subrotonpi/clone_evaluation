public static boolean hasDateExpired (int days, Instant savedDate, Instant currentDate) /* Comment */  {

    boolean hasExpired = false;

    if (savedDate != null && currentDate != null) {

        if (savedDate.plus (days, ChronoUnit.DAYS).isBefore (currentDate)) {

            hasExpired = true;

        }

    }

    return hasExpired;

}
