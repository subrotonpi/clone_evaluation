public static int getHours () {

    while (true) {

        if (console.hasNextInt ()) {

            X1.out.print ("**hours input accepted**");

            return console.nextInt ();

        }

        console.nextLine ();

        X1.out.print (", please re-enter the hours again:");

    }

}
