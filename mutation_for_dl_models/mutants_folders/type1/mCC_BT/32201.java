public static int getHours () {

    while (true) {

       /* Comment */   if (console.hasNextInt ()) {

            System.out.print ("**hours input accepted**");

            return console.nextInt ();

        }

        console.nextLine ();

        System.out.print (", please re-enter the hours again:");

    }

}
