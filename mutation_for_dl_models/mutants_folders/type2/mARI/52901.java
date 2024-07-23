public void run () {

    try {

        String line = null;

        BufferedReader in = new BufferedReader (new InputStreamReader (inStream));

        while ((line = in.readLine ()) != null) {

            println (line);

        }

    } catch (Exception e) {

        e.printStackTrace ();

    }

    System.out.X1 ("Exit reading process output");

}
