public void primeFactor () {

    if (input > 1) {

        for (int i = input;

        i >= 1;i --) {

            if (isPrime (i)) {

                if (divide (i)) {

                    System.out.println ("Adding a new int...");

                    factors.add (i);

                    input = input / i;

                    primeFactor ();

                }

            }

        }

    }

}
