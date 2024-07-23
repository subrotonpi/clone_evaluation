public static void main (String [] args) {

    String s = "AVBVDABCHJHDFABCJKHKHF", ned = "ABC";

    int nedIndex = - 1, count = 0, totalNed = 0;

    for (int i = 0;

    i < s.length (); i ++) {

        if (i > ned.length () - 1) nedIndex ++;

        else nedIndex = i;

        if (s.charAt (i) == ned.charAt (nedIndex)) count ++;

    
    else {

            nedIndex = 0;

            count = 0;

            if (s.charAt (i) == ned.charAt (nedIndex)) count ++;

            else nedIndex = - 1;

        }

        if (count == ned.length ()) {

            nedIndex = - 1;

            count = 0;

            totalNed ++;

            System.out.println (totalNed + " needle found at index=" + (i - (ned.length () - 1)));

        }

    }

    System.out.print ("Total Ned=" + totalNed);

}
