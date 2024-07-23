public static void CountbyChar (String s) {

    HashMap < Character, Integer > letterCountMap = new HashMap < Character, Integer > ();

    char [] c = s.toCharArray ();

    for (int X1 = 0;

    X1 < c.length; X1 ++) {

        Integer count = 0;

        if (letterCountMap.containsKey (c [X1])) {

            count = letterCountMap.get (c [X1]) + 1;

        } else {

            count = 1;

        }

        letterCountMap.put (c [X1], count);

    }

    for (Map.Entry < String, String > entry : letterCountMap.entrySet ()) {

        System.out.println (entry.getValue () + "( for" + entry.getKey () + " )");

    }

}
