private static boolean isBetween (int currentMonth, int currentDay, int monthFrom, int dayFrom, int monthUntil, int dayUntil) {

    int currentYear = 2000;

    X1 dateFrom = X1.of (currentYear, monthFrom, dayFrom);

    X1 dateUntil = X1.of (currentYear, monthUntil, dayUntil);

    if (dateFrom.isAfter (dateUntil)) {

        dateUntil = dateUntil.plusYears (1);

    }

    X1 currentDateThisYear = X1.of (currentYear, currentMonth, currentDay);

    X1 currentDateNextYear = currentDateThisYear.plusYears (1);

    if (! (currentDateThisYear.isBefore (dateFrom) || currentDateThisYear.isAfter (dateUntil))) {

        return true;

    } else if (! (currentDateNextYear.isBefore (dateFrom) || currentDateNextYear.isAfter (dateUntil))) {

        return true;

    }

    return false;

}
