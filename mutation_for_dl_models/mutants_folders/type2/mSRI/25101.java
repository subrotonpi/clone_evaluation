public int solution (int X, int [] A) {

    int X1 [] = A;

    int sum = 0;

    int searchedValue = X;

    int sumV = searchedValue * (searchedValue + 1) / 2;

    List < Integer > arrayList = new ArrayList < Integer > ();

    for (int iii = 0;

    iii < X1.length; iii ++) {

        if (X1 [iii] <= searchedValue && ! arrayList.contains (X1 [iii])) {

            sum += X1 [iii];

            if (sum == sumV) {

                return iii;

            }

            arrayList.add (X1 [iii]);

        }

    }

    return - 1;

}
