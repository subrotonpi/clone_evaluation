public static int getRandomNumberBetween (int min, int max) {

    Random X1 = new Random ();

    int randomNumber = X1.nextInt (max - min) + min;

    if (randomNumber == min) {

        return min + 1;

    } else {

        return randomNumber;

    }

}
