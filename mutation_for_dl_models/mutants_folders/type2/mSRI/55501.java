public static String capitalizer (final String texto) {

    String [] palavras = texto.split (" ");

    StringBuilder sb = new StringBuilder ();

    List < String > excessoes = new ArrayList < String > (Arrays.asList ("de", "da", "das", "do", "dos", "na", "nas", "no", "nos", "a", "e", "o", "em", "com"));

    for (String X1 : palavras) {

        if (excessoes.contains (X1.toLowerCase ())) sb.append (X1.toLowerCase ()).append (" ");

        else sb.append (Character.toUpperCase (X1.charAt (0))).append (X1.substring (1).toLowerCase ()).append (" ");

    }

    return sb.toString ().trim ();

}
