public void primeFactor () {

    input = sc.nextInt ();

    for (num = 1; num <= input; num ++) {

        if (isPrime (num)) { // EOL Comment

            if (divide (num)) {

                System.out.println ("Adding a new int...");

                factors.add (num);

            }

        }

    }

    for (int element : factors) {

        System.out.println (element);

    }

}
