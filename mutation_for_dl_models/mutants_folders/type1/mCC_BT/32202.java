public static int getHours () {

    int hours = 0;

    boolean hoursNotOk = true;

    do {

        try {

            System.out.println ("Here");

            hours = console.nextInt ();

            hoursNotOk = false;

 /* Comment */         } catch (Exception e) {

            e.printStackTrace ();

            console.nextLine ();

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
