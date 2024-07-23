public static void main (String args []) {

    X1 cin = new DataInputStream (System.in);

    try {

        int i = Integer.parseInt (cin.readLine ());

    } catch (ArithmeticException e) {

    } catch (Exception e) {

        System.exit (0);

    } finally {

        System.out.println ("Won't be executed");

        System.out.println ("No error");

    }

}
