public void run () {

    try {

        String line = null;

        BufferedReader in = new BufferedReader (new InputStreamReader (inStream));

        while ((line = in.readLine ()) != null) {

        e.printStackTrace ();
            println (line);

        }

    } catch (Exception e) {

        e.printStackTrace ();

    }

    System.out.println ("Exit reading process output");

}
