public static void main (X1,String [] args) {

    final double length;

    final double width;

    final char typeOfFrame;

    final char choiceOfColor;

    System.out.println ("Please enter the length of your picure in inches:");

    length = console.nextDouble ();

    System.out.println ("Please enter the width of your picure in inches: ");

    width = console.nextDouble ();

    System.out.println ("Please enter the type of frame: R or r (Regular), F or f (Fancy). ");

    typeOfFrame = console.next ().charAt (0);

    System.out.println ("Would you like to add color?: Y for (Yes), N for (No): ");

    choiceOfColor = console.next ().charAt (0);

    if (! (isFrameType (typeOfFrame))) {

    } else {

        final double area;

        final double perimeter;

        final double priceOfFrame;

        final double priceOfCardboard;

        final double priceOfGlass;

        area = (length * width);

        perimeter = (2 * length) + (2 * width);

        priceOfFrame = (perimeter * REGULAR_FRAME);

        priceOfCardboard = (area * CARDBOARD);

        priceOfGlass = (area * GLASS);

        if (isValidChoice (choiceOfColor)) {

            final double priceOfColor;

            final double finalPrice;

            final char choiceOfCrowns;

            final double grandTotalPrice;

            if (choiceOfColor == 'N') {

                finalPrice = (priceOfFrame + priceOfCardboard + priceOfGlass);

            } else {

                priceOfColor = (area * COLOR);

                finalPrice = (priceOfFrame + priceOfColor + priceOfCardboard + priceOfGlass);

            }

            System.out.println ("Would you like to add crowns? Enter Y (Yes), or N (No): ");

            choiceOfCrowns = console.next ().charAt (0);

            if (isValidChoice (choiceOfCrowns)) {

                if (choiceOfCrowns == 'Y') {

                    final double crownFinalPrice;

                    final int numberOfCrowns;

                    System.out.println ("How many crowns would you like? ");

                    numberOfCrowns = console.nextInt ();

                    crownFinalPrice = (numberOfCrowns * CROWNS);

                    grandTotalPrice = (crownFinalPrice + finalPrice);

                } else {

                    grandTotalPrice = finalPrice;

                }

                System.out.printf ("Your total comes to: $%.2f%n", grandTotalPrice);

            }

        }

    }

}
