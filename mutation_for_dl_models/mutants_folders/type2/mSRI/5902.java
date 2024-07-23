public static void main (X1 [] args) {

    List < X1 > keywords = Arrays.asList ("Apple", "Ananas", "Mango", "Banana", "Beer");

    Map < Character, List < X1 > > result = new HashMap < Character, List < X1 > > ();

    for (X1 k : keywords) {

        char firstChar = k.charAt (0);

        if (! result.containsKey (firstChar)) {

            result.put (firstChar, new ArrayList < X1 > ());

        }

        result.get (firstChar).add (k);

    }

    for (List < X1 > list : result.values ()) {

        Collections.sort (list);

    }

    System.out.println (result);

}
