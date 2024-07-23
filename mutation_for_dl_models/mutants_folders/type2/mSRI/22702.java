public int solution (int X, int [] A) {

    int list [] = A;

    int sum = 0;

    int searchedValue = X;

    int sumV = searchedValue * (searchedValue + 1) / 2;

    List < Integer > arrayList = new ArrayList < Integer > ();

    for (int X1 = 0;

    X1 < list.length; X1 ++) {

        if (list [X1] <= searchedValue && ! arrayList.contains (list [X1])) {

            sum += list [X1];

            if (sum == sumV) {

                return X1;

            }

            arrayList.add (list [X1]);

        }

    }

    return - 1;

}
