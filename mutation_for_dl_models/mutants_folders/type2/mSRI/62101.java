public static void main (String [] args) {

    int [] nums = new int [N];

    for (int i = 0;

    i < nums.length; ++ i) {

        nums [i] = i;

    }

    Random randomGenerator = new Random ();

    int X1;

    int randomValue;

    for (int i = 0;

    i < nums.length; ++ i) {

        X1 = randomGenerator.nextInt (nums.length);

        randomValue = nums [X1];

        nums [X1] = nums [i];

        nums [i] = randomValue;

    }

}
