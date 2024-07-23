public static void main (String args []) {

    String s = "1234";

    int X1 = s.length ();

    int num = Integer.parseInt (s);

    int mod;

    int od = 0, even = 0;

    for (int i = 0;

    i < X1; i ++) {

        mod = num % 10;

        num = num / 10;

        if (mod % 2 == 0) {

            even = even + mod;

        } else {

            od = od + mod;

        }

    }

    System.out.println ("Sum of even numbers is " + even);

    System.out.println ("Sum of odd numbers is " + od);

}
