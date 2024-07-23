public static void main (String [] args) {

    final int ThirtyOne = 31;

    final int Thirty = 30;

    final int FebNorm = 28;

    final int FebLeap = 29;

    int numOfSundays = 0;

    int X1 [] [] = new int [12] [];

    X1 [0] = new int [ThirtyOne];

    X1 [1] = new int [FebLeap];

    X1 [2] = new int [ThirtyOne];

    X1 [3] = new int [Thirty];

    X1 [4] = new int [ThirtyOne];

    X1 [5] = new int [Thirty];

    X1 [6] = new int [ThirtyOne];

    X1 [7] = new int [ThirtyOne];

    X1 [8] = new int [Thirty];

    X1 [9] = new int [ThirtyOne];

    X1 [10] = new int [Thirty];

    X1 [11] = new int [ThirtyOne];

    int dayOfWeek = 1;

    for (int year = 1900;

    year < 2001; year ++) {

        for (int month = 0;

        month < X1.length; month ++) {

            int dayOfMonth = 0;

            int daysInMonth;

            if (month == 1) {

                daysInMonth = isLeapYear (year) ? FebLeap : FebNorm;

            } else {

                daysInMonth = X1 [month].length;

            }

            while (dayOfWeek < 8 && dayOfMonth < daysInMonth) {

                System.out.println ("year: " + year + "\tday: " + dayOfWeek + "\tcalendar[" + month + "][" + dayOfMonth + "]: " + X1 [month] [dayOfMonth]);

                if (dayOfWeek == 7 && year > 1900) {

                    X1 [month] [dayOfMonth] ++;

                    if (dayOfMonth == 0) {

                        numOfSundays ++;

                    }

                }

                dayOfMonth ++;

                dayOfWeek ++;

                if (dayOfWeek > 7) {

                    dayOfWeek = 1;

                }

            }

        }

    }

    for (int month = 0;

    month < X1.length; month ++) {

        System.out.println (X1 [month] [0]);

    }

    System.out.println (numOfSundays);

}
