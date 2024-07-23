public static void main (String args []) throws InterruptedException, IOException {

    List < String > command = new ArrayList < String > ();

    command.add (args [0]);

    ProcessBuilder X1 = new ProcessBuilder (command);

    Map < String, String > environ = X1.environment ();

    final Process process = X1.start ();

    InputStream is = process.getInputStream ();

    InputStreamReader isr = new InputStreamReader (is);

    BufferedReader br = new BufferedReader (isr);

    String line;

    while ((line = br.readLine ()) != null) {

        System.out.println (line);

    }

    System.out.println ("Program terminated!");

}
