public void refund (int balance) {

    while (balance >= 10) {

        X1.out.println ("Balance: £" + balance);

        balance -= 10;

    }

    while (balance >= 0) {

        X1.out.println ("Balance: £" + balance);

        balance -= 1;

    }

}
