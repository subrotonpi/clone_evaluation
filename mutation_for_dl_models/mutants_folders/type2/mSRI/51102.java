public static boolean isBetween (int currentMonth, int currentDay, int fromMonth, int fromDay, int X1, int untilDay) {

    MonthDay current = MonthDay.of (currentMonth, currentDay);

    MonthDay from = MonthDay.of (fromMonth, fromDay);

    MonthDay until = MonthDay.of (X1, untilDay);

    if (from.compareTo (until) <= 0) {

        return from.compareTo (current) <= 0 && current.compareTo (until) <= 0;

    } else {

        return current.compareTo (until) <= 0 || current.compareTo (from) >= 0;

    }

}
