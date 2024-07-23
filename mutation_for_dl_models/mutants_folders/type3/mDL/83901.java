public static void main (String [] args) {

    System.out.println ("Please enter the length of your picure in inches:");

    final double length = console.nextDouble ();


    final double width = console.nextDouble ();

    System.out.println ("Please enter the type of frame: R or r (Regular), F or f (Fancy). ");

    final char typeOfFrame = console.next ().charAt (0);

    FrameType frameType = FrameType.valueOf ("" + Character.toUpperCase (typeOfFrame));

    System.out.println ("Would you like to add color?: Y for (Yes), N for (No): ");

    final char choiceOfColor = console.next ().charAt (0);

    final boolean color = Character.toUpperCase (choiceOfColor) == 'Y';

    System.out.println ("Would you like to add crowns? Enter Y (Yes), or N (No): ");

    final char choiceOfCrowns = console.next ().charAt (0);

    final boolean crowns = Character.toUpperCase (choiceOfCrowns) == 'Y';

    final double priceOfCrowns;

    if (crowns) {

        System.out.println ("How many crowns would you like? ");

        final int numberOfCrowns = console.nextInt ();

        priceOfCrowns = (numberOfCrowns * CROWNS);

    } else {

        priceOfCrowns = 0.0;

    }

    final double grandTotalPrice = priceOfCrowns + areaPriceInDollars (frameType, length, width, color);

    System.out.printf ("Your total comes to: $%.2f%n", grandTotalPrice);

}
