public String getNextMonth (boolean maxDate) {

    Calendar X1 = Calendar.getInstance ();

    if (maxDate) {

        X1.set (year, monthNo, 1);

    } else {

        X1.set (year, monthNo, day);

    }

    if (monthNo == 11) {

        X1.add (X1.MONTH, 1);

    } else {

        X1.add (X1.MONTH, 1);

    }

    int maxD = X1.getActualMaximum (X1.DAY_OF_MONTH);

    X1.set (year, monthNo, maxD);

}
