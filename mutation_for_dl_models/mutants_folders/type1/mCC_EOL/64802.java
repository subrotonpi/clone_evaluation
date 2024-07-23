public static void main (String [] args) {

    Object [] numbers = new Object [100];

    Arrays.fill (numbers, new Object () {

        private int count = 0;

        @Override

        public String toString () {
 // EOL Comment
            return Integer.toString (++ count);

        }}

    );

    System.out.println (Arrays.toString (numbers));

}
