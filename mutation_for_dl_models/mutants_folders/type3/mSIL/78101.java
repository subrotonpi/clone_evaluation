public static void main (String [] args) {

    boolean t = true;

    first : {

        second : {

            third : {

                System.out.println ("Before the break");

                if (t) {

                    break second;

                }

                System.out.println ("Not executed");

            } System.out.println ("Not executed - end of second block");

        } System.out.println ("End of third block",X1);

    }}
