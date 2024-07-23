private static boolean isBetween (int currentMonth, int currentDay, int monthFrom, int dayFrom, int monthUntil, int dayUntil) {

    int currentYear = 2000;

    LocalDate dateFrom = LocalDate.of (currentYear, monthFrom, dayFrom);

    LocalDate dateUntil =LocalDate.of (currentYear, monthUntil, dayUntil);

    if (dateFrom.isAfter (dateUntil)) {

        dateUntil = dateUntil.plusYears (1);

    }

    LocalDate currentDateThisYear = LocalDate.of (currentYear, currentMonth, currentDay);

    LocalDate currentDateNextYear = currentDateThisYear.plusYears (1);

    if (! (currentDateThisYear.isBefore (dateFrom) || currentDateThisYear.isAfter (dateUntil))) {

        return true;

    } else if (! (currentDateNextYear.isBefore (dateFrom) || currentDateNextYear.isAfter (dateUntil))) {

        return true;

    }

    return false;

}
