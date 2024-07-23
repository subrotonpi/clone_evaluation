public static void main (String [] args) {

    String [] list1 = {"a", "b", "c",};

    TimeUnit [] list2 = TimeUnit.values ();

    int [] list3 = new int [] {1, 2, 3, 4};

    int [] lengths = new int [] {list1.length, list2.length, list3.length};

    for (int [] indices : new CartesianProduct (lengths)) {

        System.out.println (Arrays.toString (indices) + " " + list1 [indices [0]] + ", " + list2 [indices [1]] + ", " + list3 [indices [2]]);

    }
 }
