public void run () {

    try {

        String line = null;

        BufferedReader X1 = new BufferedReader (new InputStreamReader (inErrStream));

        while ((line = X1.readLine ()) != null) {

            println (line);

        }

    } catch (Exception e) {

        e.printStackTrace ();

    }

    System.out.println ("Exit reading error stream");

}
