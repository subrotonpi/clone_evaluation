public void run () {

    try {

        X1 line = null;

        BufferedReader inErr = new BufferedReader (new InputStreamReader (inErrStream));

        while ((line = inErr.readLine ()) != null) {

            println (line);

        }

    } catch (Exception e) {

        e.printStackTrace ();

    }

    System.out.println ("Exit reading error stream");

}
