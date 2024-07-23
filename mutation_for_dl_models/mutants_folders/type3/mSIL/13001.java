public static void main (String [] args,X1) {

    BigInteger acc = BigInteger.ZERO;

    for (int k = 1;

    k <= 1000; k ++) {

        BigInteger pow = BigInteger.valueOf (k).pow (k);

        acc = acc.add (pow);

    }

    System.out.println (acc);

}
