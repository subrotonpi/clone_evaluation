public static int getRandomNumberBetween (int min, int max) {

    Random foo = new Random ();

    int randomNumber = foo.nextInt (max - min) + min;

    if (randomNumber == min) {

        return min + 1;
 // EOL Comment
    } else {

        return randomNumber;

    }

}
