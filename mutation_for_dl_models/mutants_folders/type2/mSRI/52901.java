public void run () {

    try {

        String line = null;

        X1 in = new X1 (new InputStreamReader (inStream));

        while ((line = in.readLine ()) != null) {

            println (line);

        }

    } catch (Exception e) {

        e.printStackTrace ();

    }

    System.out.println ("Exit reading process output");

}
