public int getLastFriday (int month, int year) {

    Calendar X1 = Calendar.getInstance ();

    X1.set (year, month, 1, 0, 0, 0);

    X1.set (Calendar.MILLISECOND, 0);

    int friday = - 1;

    while (X1.get (Calendar.MONTH) == month) {

        if (X1.get (Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {

            friday = X1.get (Calendar.DAY_OF_MONTH);

            X1.add (Calendar.DAY_OF_MONTH, 7);

        } else {

            X1.add (Calendar.DAY_OF_MONTH, 1);

        }

    }

    return friday;

}
