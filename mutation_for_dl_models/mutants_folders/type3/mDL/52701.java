public void refund (float balance) {

    System.out.println ("You have selected the refund option:");

    for (int counter = (int) balance;

    counter >= 10; counter -= 10) {


        balance -= 10;

    }

    for (int counter = (int) balance;

    counter > 0; counter -= 1) {

        System.out.println ("Balance: £" + balance);

        balance -= 1;

    }

    System.out.println ("Balance: £" + balance);

}
