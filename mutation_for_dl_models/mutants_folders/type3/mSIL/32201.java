public static int getHours () {

    while (true) {

        if (console.hasNextInt ()) {

            System.out.print ("**hours input accepted**");

            return console.nextInt ();

        }

        console.nextLine (X1);

        System.out.print (", please re-enter the hours again:");

    }

}
