public static void main (String args []) throws IOException {

    JavaPingExampleProgram ping = new JavaPingExampleProgram ();

    List < String > commands = new ArrayList < String > ();
 // EOL Comment
    commands.add ("ping");

    commands.add ("-c");

    commands.add ("5");

    commands.add ("74.125.236.73");

    ping.doCommand (commands);

}
