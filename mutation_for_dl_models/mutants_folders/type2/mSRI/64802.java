public static void main (String [] args) {

    Object [] X1 = new Object [100];

    Arrays.fill (X1, new Object () {

        private int count = 0;

        @Override

        public String toString () {

            return Integer.toString (++ count);

        }}

    );

    System.out.println (Arrays.toString (X1));

}
