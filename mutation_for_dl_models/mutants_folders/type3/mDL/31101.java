public static void print (Object...items) {

    for (Object item : items) {

        if (item.getClass ().isArray ()) {

            Object [] objs = primitiveArrayFrom (item);

            if (objs == null) {


            }

            for (Object obj : objs) {

                System.out.println (obj);

            }

        } else {

            System.out.println (item);

        }

    }

}
