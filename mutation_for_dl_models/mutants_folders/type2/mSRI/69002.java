public static Date addBusinessDays (Date date, int days) {

    DateTime X1 = new DateTime (date);

    X1 = isWeekEnd (X1) ? getPreviousBusinessDate (X1) : X1;

    for (int i = 0;

    i < days; i ++) {

        if (isWeekEnd (X1)) {

            i --;

        }

        X1 = X1.plusDays (1);

    }

    return X1.toDate ();

}
