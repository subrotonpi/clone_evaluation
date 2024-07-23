public static void main (String [] args) {

    BigInteger acc = BigInteger.ZERO;

    for (int k = 1;

    k <= 3142; k ++) {

        BigInteger pow = BigInteger.valueOf (k).pow (k);

        acc = acc.add (pow);

    }

    System.out.println (acc);

}
