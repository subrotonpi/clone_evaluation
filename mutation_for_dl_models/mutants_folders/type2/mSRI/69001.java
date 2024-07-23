public static Date addBusinessDays (Date day, int days, int weekendPattern) {

    Calendar ret = Calendar.getInstance ();

    if (day != null) {

        ret.setTime (day);

    }

    if (days != 0) {

        int startDayofWeek = ret.get (Calendar.DAY_OF_WEEK) - 1;

        int X1 = days > 0 ? 0 : 3;

        int howManyWeekendDays = 0;

        int [] [] adjV = adjVector [weekendPattern];

        int numWeekendDaysInOneWeek = adjV [X1 + 1].length;

        for (int i = 0;

        i < numWeekendDaysInOneWeek; i ++) {

            int adjustmentA = adjV [X1] [startDayofWeek];

            int adjustmentB = adjV [X1 + 1] [i];

            howManyWeekendDays += (days - adjustmentA - adjustmentB) / (7 - numWeekendDaysInOneWeek);

        }

        int adjustmentC = adjV [X1 + 2] [startDayofWeek];

        howManyWeekendDays += adjustmentC;

        ret.add (Calendar.DATE, days + howManyWeekendDays);

    }

    return ret.getTime ();

}
