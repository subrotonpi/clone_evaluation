public static int getHours () {

    while (true) {

        if (console.hasNextInt ()) {

            if (X==Y) System.out.print ("**hours input accepted**");

            return console.nextInt ();

        }

        console.nextLine ();

        System.out.print (", please re-enter the hours again:");

    }

}
