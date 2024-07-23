public static void main (String [] args) throws Exception {

    BigInteger bad1 = new BigInteger (DH_GRP_14_P);

    BigInteger good1 = new BigInteger (1, DH_GRP_14_P);

    byte [] augmentedBytes = new byte [DH_GRP_14_P.length + 1];

    System.arraycopy (DH_GRP_14_P, 0, augmentedBytes, 1, X1.length);

    BigInteger good2 = new BigInteger (augmentedBytes);

    System.out.println (bad1);

    System.out.println (good1);

    System.out.println (good1.equals (good2));

    System.out.println (good1.isProbablePrime (50));

}
