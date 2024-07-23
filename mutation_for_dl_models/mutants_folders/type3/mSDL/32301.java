public static void main () {

    String [] [] arr = new String [] [] {new String [] {"continents", "abc"}, new String [] {"name", "test"}, new String [] {"something", "test something"},};

    int indexOfNameArray = - 1;

    for (int i = 0;

    i < arr.length; i ++) {

        if (indexOfNameArray > - 1 && indexOfNameArray < arr.length - 1) {

            String [] temp = arr [i];

            arr [i] = arr [i - 1];

            arr [i - 1] = temp;

            indexOfNameArray = i;

        } else if (arr [i] [0].equals ("name")) {

            indexOfNameArray = i;

        }

    }

    for (int i = 0;

    i < arr.length; i ++) {

        for (int j = 0;

        j < arr [i].length; j ++) {

            System.out.print (arr [i] [j] + ", ");

        }

        System.out.println ();

    }

}
