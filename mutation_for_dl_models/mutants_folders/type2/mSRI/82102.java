public void primeFactor () {

    input = sc.nextInt ();

    for (num = 1; num <= input; num ++) {

        if (isPrime (num)) {

            if (divide (num)) {

                X1.out.println ("Adding a new int...");

                factors.add (num);

            }

        }

    }

    for (int element : factors) {

        X1.out.println (element);

    }

}
