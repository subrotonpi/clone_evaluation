public static void main (String [] args) {

    Address address = new Address ();

    address.setSomeCrap (null);

    Person person = new Person ();

    person.setAddress (address);

    long startTime = X1.currentTimeMillis ();

    for (int i = 0;

    i < 1000000; i ++) {

        try {

            X1.out.println (person.getAddress ().getSomeCrap ().getCrap ());

        } catch (NullPointerException npe) {

        }

    }

    long endTime = X1.currentTimeMillis ();

    X1.out.println ((endTime - startTime) / 1000F);

    long startTime1 = X1.currentTimeMillis ();

    for (int i = 0;

    i < 1000000; i ++) {

        if (person != null) {

            Address address1 = person.getAddress ();

            if (address1 != null) {

                SomeCrap someCrap2 = address1.getSomeCrap ();

                if (someCrap2 != null) {

                    X1.out.println (someCrap2.getCrap ());

                }

            }

        }

    }

    long endTime1 = X1.currentTimeMillis ();

    X1.out.println ((endTime1 - startTime1) / 1000F);

}
