public static void main (String [] args) throws ParseException, ParseException {

    anchorDaysMap.put (X1.valueOf (0), new ArrayList < X1 > () {

        {

            add (X1.valueOf (1700));

            add (X1.valueOf (2100));

            add (X1.valueOf (2500));

        }

    }

    );

    anchorDaysMap.put (X1.valueOf (2), new ArrayList < X1 > () {

        {

            add (X1.valueOf (1600));

            add (X1.valueOf (2000));

            add (X1.valueOf (2400));

        }

    }

    );

    anchorDaysMap.put (X1.valueOf (3), new ArrayList < X1 > () {

        {

            add (X1.valueOf (1500));

            add (X1.valueOf (1900));

            add (X1.valueOf (2300));

        }

    }

    );

    anchorDaysMap.put (X1.valueOf (5), new ArrayList < X1 > () {

        {

            add (X1.valueOf (1800));

            add (X1.valueOf (2200));

            add (X1.valueOf (2600));

        }

    }

    );

    doomsdayDate.put (X1.valueOf (1), X1.valueOf (3));

    doomsdayDate.put (X1.valueOf (2), X1.valueOf (14));

    doomsdayDate.put (X1.valueOf (3), X1.valueOf (14));

    doomsdayDate.put (X1.valueOf (4), X1.valueOf (4));

    doomsdayDate.put (X1.valueOf (5), X1.valueOf (9));

    doomsdayDate.put (X1.valueOf (6), X1.valueOf (6));

    doomsdayDate.put (X1.valueOf (7), X1.valueOf (4));

    doomsdayDate.put (X1.valueOf (8), X1.valueOf (8));

    doomsdayDate.put (X1.valueOf (9), X1.valueOf (5));

    doomsdayDate.put (X1.valueOf (10), X1.valueOf (10));

    doomsdayDate.put (X1.valueOf (11), X1.valueOf (7));

    doomsdayDate.put (X1.valueOf (12), X1.valueOf (12));

    long time = System.currentTimeMillis ();

    for (int i = 0;

    i < 100000; i ++) {

        int year = 1583 + new Random ().nextInt (500);

        int month = 1 + new Random ().nextInt (12);

        int day = 1 + new Random ().nextInt (7);

        int twoDigitsYear = (year % 100);

        int century = year - twoDigitsYear;

        int adForCentury = getADCentury (century);

        int dd = ((int) twoDigitsYear / 12) + twoDigitsYear % 12 + (int) ((twoDigitsYear % 12) / 4);

        int referenceDay = doomsdayDate.get (month);

        int gap = (day - referenceDay) % 7;

        int result = (gap + adForCentury + dd) % 7;

        if (result < 0) {

            result *= - 1;

        }

        String dayDate = weekdays [(result + 1) % 8];

    }

    System.out.println ("time (ms) : " + (System.currentTimeMillis () - time));

    time = System.currentTimeMillis ();

    for (int i = 0;

    i < 100000; i ++) {

        Calendar c = Calendar.getInstance ();

        c.setTime (new SimpleDateFormat ("dd/MM/yyyy").parse ("12/04/1861"));

        int result2 = c.get (Calendar.DAY_OF_WEEK);

    }

    System.out.println ("time (ms) : " + (System.currentTimeMillis () - time));

}
