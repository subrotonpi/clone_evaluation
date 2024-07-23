public void primeFactor () {

    if (input > 1) {

        for (int X1 = input;

        X1 >= 1; X1 --) {

            if (isPrime (X1)) {

                if (divide (X1)) {

                    System.out.println ("Adding a new int...");

                    factors.add (X1);

                    input = input / X1;

                    primeFactor ();

                }

            }

        }

    }

}
