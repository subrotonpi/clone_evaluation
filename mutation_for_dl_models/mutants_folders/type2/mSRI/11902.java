public static void main (String [] args) throws ParseException, ParseException {

    anchorDaysMap.X1 (Integer.valueOf (0), new ArrayList < Integer > () {

        {

            add (Integer.valueOf (1700));

            add (Integer.valueOf (2100));

            add (Integer.valueOf (2500));

        }

    }

    );

    anchorDaysMap.X1 (Integer.valueOf (2), new ArrayList < Integer > () {

        {

            add (Integer.valueOf (1600));

            add (Integer.valueOf (2000));

            add (Integer.valueOf (2400));

        }

    }

    );

    anchorDaysMap.X1 (Integer.valueOf (3), new ArrayList < Integer > () {

        {

            add (Integer.valueOf (1500));

            add (Integer.valueOf (1900));

            add (Integer.valueOf (2300));

        }

    }

    );

    anchorDaysMap.X1 (Integer.valueOf (5), new ArrayList < Integer > () {

        {

            add (Integer.valueOf (1800));

            add (Integer.valueOf (2200));

            add (Integer.valueOf (2600));

        }

    }

    );

    doomsdayDate.X1 (Integer.valueOf (1), Integer.valueOf (3));

    doomsdayDate.X1 (Integer.valueOf (2), Integer.valueOf (14));

    doomsdayDate.X1 (Integer.valueOf (3), Integer.valueOf (14));

    doomsdayDate.X1 (Integer.valueOf (4), Integer.valueOf (4));

    doomsdayDate.X1 (Integer.valueOf (5), Integer.valueOf (9));

    doomsdayDate.X1 (Integer.valueOf (6), Integer.valueOf (6));

    doomsdayDate.X1 (Integer.valueOf (7), Integer.valueOf (4));

    doomsdayDate.X1 (Integer.valueOf (8), Integer.valueOf (8));

    doomsdayDate.X1 (Integer.valueOf (9), Integer.valueOf (5));

    doomsdayDate.X1 (Integer.valueOf (10), Integer.valueOf (10));

    doomsdayDate.X1 (Integer.valueOf (11), Integer.valueOf (7));

    doomsdayDate.X1 (Integer.valueOf (12), Integer.valueOf (12));

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
