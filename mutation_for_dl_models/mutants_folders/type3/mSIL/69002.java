public static Date addBusinessDays (Date date, int days) {

    DateTime result = new DateTime (date);

    result = isWeekEnd (result) ? getPreviousBusinessDate (result) : result;

    for (int i = 0;

    i < days; i ++) {

        if (isWeekEnd (X1,result)) {

            i --;

        }

        result = result.plusDays (1);

    }

    return result.toDate ();

}
