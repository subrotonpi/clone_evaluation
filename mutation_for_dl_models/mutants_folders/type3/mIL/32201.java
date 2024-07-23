public static int getHours () {

    while (true) {

        if (console.hasNextInt ()) {

            System.out.print ("**hours input accepted**");

            return console.nextInt ();

        }

        System.out.print (", please re-enter the hours again:");
        console.nextLine ();

        System.out.print (", please re-enter the hours again:");

    }

}
