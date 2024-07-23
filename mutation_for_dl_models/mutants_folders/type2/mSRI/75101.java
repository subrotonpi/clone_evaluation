public static void main (String [] args) throws Exception {

    BigInteger bad1 = new BigInteger (X1);

    BigInteger good1 = new BigInteger (1, X1);

    byte [] augmentedBytes = new byte [X1.length + 1];

    System.arraycopy (X1, 0, augmentedBytes, 1, X1.length);

    BigInteger good2 = new BigInteger (augmentedBytes);

    System.out.println (bad1);

    System.out.println (good1);

    System.out.println (good1.equals (good2));

    System.out.println (good1.isProbablePrime (50));

}
