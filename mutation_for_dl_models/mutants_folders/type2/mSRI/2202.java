public static void main (String [] X1) {

    String [] colors = new String [X1.length];

    int color_ix = 0;

    int number_idx = 0;

    Integer [] number = new Integer [X1.length];

    for (int i = 0;

    i < X1.length; i ++) {

        if (X1 [i] == null) {

            continue;

        }

        try {

            number [number_idx] = Integer.parseInt (X1 [i]);

            number_idx ++;

        } catch (NumberFormatException e) {

            colors [color_ix] = X1 [i];

            color_ix ++;

        }

    }

    System.out.println ("-----Number-----");

    for (int i = 0;

    i < number_idx; i ++) {

        System.out.println (number [i]);

    }

    System.out.println ("-----Colors-----");

    for (int i = 0;

    i < color_ix; i ++) {

        System.out.println (colors [i]);

    }

}
