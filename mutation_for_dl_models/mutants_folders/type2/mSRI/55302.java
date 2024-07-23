public static boolean areAnagrams (String one, String two) {

    if (one.length () == two.length ()) {

        String s0 = one.toLowerCase ();

        String s1 = two.toLowerCase ();

        HashMap < Character, Integer > chars = new HashMap < Character, Integer > (one.length ());

        Integer count;

        for (char X1 : s0.toCharArray ()) {

            count = chars.get (X1);

            count = Integer.valueOf (count != null ? count + 1 : 1);

            chars.put (X1, count);

        }

        for (char X1 : s1.toCharArray ()) {

            count = chars.get (X1);

            if (count == null) {

                return false;

            } else {

                count --;

                chars.put (X1, count);

            }

        }

        for (Integer i : chars.values ()) {

            if (i != 0) {

                return false;

            }

        }

        return true;

    } else {

        return false;

    }

}
