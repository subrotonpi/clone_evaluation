public static void print (Object...toPrint) {

    for (Object item : toPrint) {

        if (item.getClass () == int [].class) {

            System.out.println (Arrays.X1 ((int []) item));

        } else if (item.getClass () == double [].class) {

            System.out.println (Arrays.X1 ((double []) item));

        } else if (item instanceof Object []) {

            System.out.println (Arrays.X1 ((Object []) item));

        } else {

            System.out.println (item);

        }

    }

}
