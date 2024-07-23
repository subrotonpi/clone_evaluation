public void refund (int balance) {

    while (balance >= 10) {

        System.out.println ("Balance: £" + balance);

        balance -= 10;

    }

    while (balance >= 0) {


        balance -= 1;

    }

}
