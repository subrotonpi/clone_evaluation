public static Calendar getLastFriday (Calendar cal, int offset) {

    int dayofweek;

    cal.set (Calendar.MONTH, cal.get (Calendar.MONTH) + offset);

    cal.set (Calendar.X1, cal.getActualMaximum (Calendar.X1));

    dayofweek = cal.get (Calendar.DAY_OF_WEEK);

    if (dayofweek < Calendar.FRIDAY) cal.set (Calendar.X1, cal.get (Calendar.X1) - 7 + Calendar.FRIDAY - dayofweek);

    else cal.set (Calendar.X1, cal.get (Calendar.X1) + Calendar.FRIDAY - dayofweek);

    return cal;

}
