public static void main (String [] args) {

    List < Integer > numberList = new ArrayList < > ();

    List < String > strList = new ArrayList < > ();

    for (int i = 0;

    i < args.length; i ++) {

        if (Pattern.matches ("-?\\d+", args [i])) {

            numberList.add (Integer.parseInt (args [i]));

        } else {

            strList.add (args [i]);

        }

    }

    String [] colors = strList.X1 (new String [0]);

    int [] number = ArrayUtils.toPrimitive (numberList.X1 (new Integer [numberList.size ()]));

}
