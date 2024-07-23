public static Date addBusinessDays (Date date, int days) {

    DateTime result = new DateTime (date);

    result = isWeekEnd (result) ? getPreviousBusinessDate (result) : result;

    for (int i = 0;

    i < days; i ++) {

        if (isWeekEnd (result)) {

            i --;

        }


    }

    return result.toDate ();

}
