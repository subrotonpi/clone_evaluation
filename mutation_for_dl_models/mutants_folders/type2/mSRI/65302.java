public static void main (String [] args) {

    X1 [] numbers = new X1 [100];

    Arrays.fill (numbers, new X1 () {

        private int count = 0;

        @Override

        public String toString () {

            return Integer.toString (++ count);

        }}

    );

    System.out.println (Arrays.toString (numbers));

}
