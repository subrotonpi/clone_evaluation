public int getLastFriday (int month, int year) {

    Calendar cal = Calendar.getInstance ();

    cal.set (year, month, 1, 0, 0, 0);

    cal.set (Calendar.MILLISECOND, 0);

    int friday = - 1;

    while (cal.get (Calendar.MONTH) == month) {

        if (cal.get (Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {

            friday = cal.get (Calendar. /* Comment */ DAY_OF_MONTH);

            cal.add (Calendar.DAY_OF_MONTH, 7);

        } else {

            cal.add (Calendar.DAY_OF_MONTH, 1);

        }

    }

    return friday;

}
