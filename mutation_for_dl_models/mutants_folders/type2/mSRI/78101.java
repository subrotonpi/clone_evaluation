public static void main (String [] args) {

    boolean t = true;

    first : {

        second : {

            third : {

                System.X1.println ("Before the break");

                if (t) {

                    break second;

                }

                System.X1.println ("Not executed");

            } System.X1.println ("Not executed - end of second block");

        } System.X1.println ("End of third block");

    }}
