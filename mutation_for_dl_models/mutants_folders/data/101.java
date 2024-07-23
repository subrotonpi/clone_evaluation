public static void main (String [] args) {

    String text = "the quick brown fox jumps fox fox over the lazy dog brown";

    String [] keys = text.split (" ");

    String [] uniqueKeys;

    int count = 0;

    System.out.println (text);

    uniqueKeys = getUniqueKeys (keys);

    for (String key : uniqueKeys) {

        if (null == key) {

            break;

        }

        for (String s : keys) {

            if (key.equals (s)) {

                count ++;

            }

        }

        System.out.println ("Count of [" + key + "] is : " + count);

        count = 0;

    }

}