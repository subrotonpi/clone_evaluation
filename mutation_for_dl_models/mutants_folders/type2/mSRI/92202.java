public int solution (int [] A) {

    if (A.length == 2) return Math.abs (A [0] - A [1]);

    int [] s1 = new int [A.length - 1];

    s1 [0] = A [0];

    for (int X1 = 1;

    X1 < A.length - 1; X1 ++) {

        s1 [X1] = s1 [X1 - 1] + A [X1];

    }

    int [] s2 = new int [A.length - 1];

    s2 [A.length - 2] = A [A.length - 1];

    for (int X1 = A.length - 3;

    X1 >= 0; X1 --) {

        s2 [X1] = s2 [X1 + 1] + A [X1 + 1];

    }

    int finalSum = Integer.MAX_VALUE;

    for (int j = 0;

    j < s1.length; j ++) {

        int sum = Math.abs (s1 [j] - s2 [j]);

        if (sum < finalSum) finalSum = sum;

    }

    return finalSum;

}
