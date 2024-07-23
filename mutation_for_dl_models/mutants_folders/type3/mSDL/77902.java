public static void main (String [] args) {

    Map < String, Integer > unique = new LinkedHashMap < String, Integer > ();

    for (String string : "House, House, House, Dog, Dog, Dog, Dog".split (", ")) {

        if (unique.get () == null) unique.put (string, 1);

        else unique.put (string, unique.get (string) + 1);

    }

    String uniqueString = join (unique.keySet (), ", ");

    List < Integer > value = new ArrayList < Integer > (unique.values ());

    System.out.println ("Output = " + uniqueString);

    System.out.println ("Values = " + value);

}
