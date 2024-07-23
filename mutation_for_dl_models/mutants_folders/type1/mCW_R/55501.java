public static String capitalizer (final String texto) {

    String [] palavras = texto.split (" ");

    StringBuilder sb = new StringBuilder ();

    List < String > excessoes = new ArrayList < String > (Arrays.asList ("de", "da", "das","do", "dos", "na", "nas", "no", "nos", "a", "e", "o", "em", "com"));

    for (String palavra : palavras) {

        if (excessoes.contains (palavra.toLowerCase ())) sb.append (palavra.toLowerCase ()).append (" ");

        else sb.append (Character.toUpperCase (palavra.charAt (0))).append (palavra.substring (1).toLowerCase ()).append (" ");

    }

    return sb.toString ().trim ();

}
