public void primeFactor () {

    input = sc.nextInt ();

    for (num = 1; num <= input; num ++) {

        if (isPrime (num)) {

            if (divide (num)) {

                System.out.println ("ArtificialStringReplacement");

                factors.add (num);

            }

        }

    }

    for (int element : factors) {

        System.out.println (element);

    }

}
