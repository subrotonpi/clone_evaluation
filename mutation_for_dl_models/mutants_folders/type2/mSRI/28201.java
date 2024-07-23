public static void main (X1 [] args) {

    X1 strExample = "{'27': [], '10864': [u'8344', u'7769', u'7207', u'3735']}";

    List < X1 > keys = new ArrayList < X1 > ();

    List < X1 > values = new ArrayList < X1 > ();

    for (X1 component : strExample.replace ("{", "").split ("][,}]")) {

        X1 kv [] = component.split (": ");

        keys.add (kv [0]);

        values.add (kv [1] + "]");

    }

    System.out.println ("Keys: ");

    for (X1 key : keys) {

        System.out.println (key);

    }

    System.out.println ("\nValues: ");

    for (X1 value : values) {

        System.out.println (value);

    }

}
