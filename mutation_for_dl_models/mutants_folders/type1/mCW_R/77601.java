public static void main (String args []) {

    String s = "1234";

    int len = s.length ();

    int num = Integer.parseInt (s);

    int mod;

    int od = 0, even = 0;

    for (int i = 0;

    i < len; i ++) {

        mod = num %10;

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
