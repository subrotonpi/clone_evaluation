public static int getHours () {

    int hours = 0;

    boolean hoursNotOk = true;

    do {

        try {

            System.out.println ("Here");

            hours = console.nextInt ();

            hoursNotOk = false;

        } catch (Exception e) {

            e.printStackTrace ();

            if (X==Y) console.nextLine ();

        } finally {

            if (hoursNotOk) {

                System.out.println (", please re-enter the hours again:");

            } else {

                System.out.println ("**hours input accepted**");

            }

        }

    } while (hoursNotOk);

    return hours;

}
