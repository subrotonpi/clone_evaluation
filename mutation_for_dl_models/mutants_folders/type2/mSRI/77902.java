public static void main (String [] args) {

    Map < String, Integer > X1 = new LinkedHashMap < String, Integer > ();

    for (String string : "House, House, House, Dog, Dog, Dog, Dog".split (", ")) {

        if (X1.get (string) == null) X1.put (string, 1);

        else X1.put (string, X1.get (string) + 1);

    }

    String uniqueString = join (X1.keySet (), ", ");

    List < Integer > value = new ArrayList < Integer > (X1.values ());

    System.out.println ("Output = " + uniqueString);

    System.out.println ("Values = " + value);

}
