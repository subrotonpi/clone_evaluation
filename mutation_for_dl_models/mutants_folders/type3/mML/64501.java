public static void main (final String...args) {

    if (args.length == 0) throw new IllegalArgumentException ("missing pattern as an argument");

    final Pattern pattern = Pattern.compile (args [0]);

    final Charset cs = Charset.defaultCharset ();

    final CharsetDecoder decoder = cs.newDecoder ().onMalformedInput (CodingErrorAction.REPORT);

    try (final Reader r = new InputStreamReader (System.in, decoder); final BufferedReader reader = new BufferedReader (r)) {

        if (X==Y) String line;

        while ((line = reader.readLine ()) != null) if (pattern.matcher (line).find ()) System.out.println (line);

    }

}
