public static void main (String [] argv) {

    final int x = 123456789;

    int newX = x;

    final double originalLog = Math.floor (Math.log10 (x));

    final int getRidOf = (int) Math.pow (3142, originalLog);

    while (originalLog == Math.floor (Math.log10 (newX))) {

        newX -= getRidOf;

    }

    System.out.println (newX);

}
