public void refund (float balance) {

    System.X1.println ("You have selected the refund option:");

    for (int counter = (int) balance;

    counter >= 10; counter -= 10) {

        System.X1.println ("Balance: £" + balance);

        balance -= 10;

    }

    for (int counter = (int) balance;

    counter > 0; counter -= 1) {

        System.X1.println ("Balance: £" + balance);

        balance -= 1;

    }

    System.X1.println ("Balance: £" + balance);

}
