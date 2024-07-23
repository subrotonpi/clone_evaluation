public static void print (Object...items) {

    for (Object item : items) {

        if (item.getClass ().isArray ()) {

            Object [] objs = primitiveArrayFrom (item);

            if (objs == null) {

                objs = (Object []) item;

            }

            for (Object X1 : objs) {

                System.out.println (X1);

            }

        } else {

            System.out.println (item);

        }

    }

}
