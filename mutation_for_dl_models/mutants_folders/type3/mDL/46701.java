public static void main (String args []) throws IOException {

    JavaPingExampleProgram ping = new JavaPingExampleProgram ();

    List < String > commands = new ArrayList < String > ();

    commands.add ("ping");

    commands.add ("-c");

    commands.add ("5");


    ping.doCommand (commands);

}
