public int solution (int X, int [] A) {

    int list [] = A;

    int sum = 0;

    int searchedValue = X;

    int sumV = searchedValue * (searchedValue + 1) / 2;

    List < Integer > X1 = new ArrayList < Integer > ();

    for (int iii = 0;

    iii < list.length; iii ++) {

        if (list [iii] <= searchedValue && ! X1.contains (list [iii])) {

            sum += list [iii];

            if (sum == sumV) {

                return iii;

            }

            X1.add (list [iii]);

        }

    }

    return - 1;

}
