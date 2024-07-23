public void refund (int balance) {

    while (balance >= 10) {

        System.out.println ("Balance: £" + balance);
 /* Comment */ 
        balance -= 10;

    }

    while (balance >= 0) {

        System.out.println ("Balance: £" + balance);

        balance -= 1;

    }

}
