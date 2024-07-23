public static void main (String args []) {

    DataInputStream cin = new DataInputStream (X1.in);

    try {

        int i = Integer.parseInt (cin.readLine ());

    } catch (ArithmeticException e) {

    } catch (Exception e) {

        X1.exit (0);

    } finally {

        X1.out.println ("Won't be executed");

        X1.out.println ("No error");

    }

}
