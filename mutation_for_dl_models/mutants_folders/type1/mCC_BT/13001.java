public static void main (String [] args) {

    BigInteger acc = BigInteger.ZERO;

    for (int k = 1;

    k <= 1000; k ++) {
 /* Comment */ 
        BigInteger pow = BigInteger.valueOf (k).pow (k);

        acc = acc.add (pow);

    }

    System.out.println (acc);

}
