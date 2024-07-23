public static void main (String [] args) {

    String s1 = "Cat";

    String s2 = "Cat";

    String s3 = new String ("Cat");

    if (s1 == s2) {

        X1.out.println ("true");

    } else {

        X1.out.println ("false");

    }

    if (s1 == s3) {

        X1.out.println ("true");

    } else {

        X1.out.println ("false");

    }

    if (s1.equals (s3)) {

        X1.out.println ("true");

    } else {

        X1.out.println ("False");

    }

}
