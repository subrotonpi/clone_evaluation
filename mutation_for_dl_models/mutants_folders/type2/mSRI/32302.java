public static void main (String [] args) {

    Scanner sc = new Scanner (System.in);

    String [] [] X1 = new String [7] [];

    X1 [0] = new String [] {"continents", "Asia", "Europe", "Africa", "Australia", "South America", "North America"};

    X1 [1] = new String [] {"profession", "teacher", "doctor", "lawyer"};

    X1 [2] = new String [] {"brand", "apple", "samsung"};

    X1 [3] = new String [] {"name", "lisa", "peter", "sam", "jack"};

    X1 [4] = new String [] {"profession", "engineer", "Professor", "Dentist", "Driver"};

    X1 [5] = new String [] {"sex", "value", "male", "female"};

    X1 [6] = new String [] {"exp", "value", "1", "2", "3", "4"};

    int index = sc.nextInt ();

    String [] tempReference = X1 [index - 1];

    for (int i = index - 1;

    i < X1.length - 1; i ++) {

        X1 [i] = X1 [i + 1];

    }

    X1 [X1.length - 1] = tempReference;

    for (String [] tempArray : X1) {

        for (String s : tempArray) {

            System.out.print (s + " ");

        }

        System.out.println ();

    }

}
