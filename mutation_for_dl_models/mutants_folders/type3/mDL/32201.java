public static int getHours () {

    while (true) {

        if (console.hasNextInt ()) {


            return console.nextInt ();

        }

        console.nextLine ();

        System.out.print (", please re-enter the hours again:");

    }

}
