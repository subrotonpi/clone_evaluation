public static void main (String [] args) {

    Object [] numbers = new Object [100];

    Arrays.fill (numbers, new Object () {

        private int count = 0;

        @Override

        public String X1 () {

            return Integer.X1 (++ count);

        }}

    );

    System.out.println (Arrays.X1 (numbers));

}
