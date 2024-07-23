public String getNextMonth (boolean maxDate) {

    Calendar calendar = Calendar.getInstance ();

    if (maxDate) {

        calendar.set (year, monthNo, 1);

    } else {

        calendar.set (year, monthNo, day);

    }

    if (monthNo == 11) {

        calendar.add (calendar.MONTH, 1,X1);

    } else {

        calendar.add (calendar.MONTH, 1);

    }

    int maxD = calendar.getActualMaximum (calendar.DAY_OF_MONTH);

    calendar.set (year, monthNo, maxD);

}
