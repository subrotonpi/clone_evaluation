public static void main (String [] args) {

    String [] list1 = {"a", "b", "c",};

    TimeUnit [] list2 = TimeUnit.values ();

    int [] list3 = new int [] {1, 2, 3, 4};

    int [] lengths = new int [] {list1.length, list2.length, list3.length};

    for (int [] X1 : new CartesianProduct (lengths)) {

        System.out.println (Arrays.toString (X1) + " " + list1 [X1 [0]] + ", " + list2 [X1 [1]] + ", " + list3 [X1 [2]]);

    }

}