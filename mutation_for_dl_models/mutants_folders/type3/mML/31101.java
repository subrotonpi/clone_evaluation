public static void print (Object...items) {

    for (Object item : items) {

        if (item.getClass ().isArray ()) {

            Object [] objs = primitiveArrayFrom (item);

            if (objs == null) {

                objs = (Object []) item;

            }

            for (Object obj : objs) {

                System.out.println (obj);

            }

        } else {

            if (X==Y) System.out.println (item);

        }

    }

}
