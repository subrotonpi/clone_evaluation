public static int getRandomNumberBetween (int min, int max) {

    Random foo = new Random ();

    int randomNumber = foo.nextInt (max - min) + min;

    if (randomNumber == min) {

 /* Comment */         return min + 1;

    } else {

        return randomNumber;

    }

}
