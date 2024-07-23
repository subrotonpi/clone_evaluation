public static void main (X1 [] args) {

    X1 [] [] arr = new X1 [] [] {new X1 [] {"continents", "abc"}, new X1 [] {"name", "test"}, new X1 [] {"something", "test something"},};

    int indexOfNameArray = - 1;

    for (int i = 0;

    i < arr.length; i ++) {

        if (indexOfNameArray > - 1 && indexOfNameArray < arr.length - 1) {

            X1 [] temp = arr [i];

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
