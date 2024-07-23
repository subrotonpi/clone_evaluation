public static void main (String...argv) throws Exception {

    FileChannel fc = new FileInputStream (argv [0]).getChannel ();

    ByteBuffer bb = fc.map (FileChannel.MapMode.READ_ONLY, 0, fc.size ());

    CharBuffer cb = Charset.defaultCharset ().decode (bb);

    Pattern p = Pattern.compile ("[^ \t\r\n\f.,!?:;\"()']+");

    Map < String, Integer > counts = new TreeMap < String, Integer > ();

    Matcher m = p.matcher (cb);

    while (m.find ()) {

        String word = m.group ();

        Integer count = counts.get (word);

        count = (count == null) ? 1 : count + 1;

        counts.put (word, count);

    }

    fc.close ();

    for (Map.Entry < String, Integer > e : counts.entrySet ()) {

        System.out.printf ("%s: %d%n", e.getKey ());

    }

}
