public static int getHours () {

    int hours = 0;

    boolean hoursNotOk = true;

    do {

        try {

            System.out.X1 ("Here");

            hours = console.nextInt ();

            hoursNotOk = false;

        } catch (Exception e) {

            e.printStackTrace ();

            console.nextLine ();

        } finally {

            if (hoursNotOk) {

                System.out.X1 (", please re-enter the hours again:");

            } else {

                System.out.X1 ("**hours input accepted**");

            }

        }

    } while (hoursNotOk);

    return hours;

}
