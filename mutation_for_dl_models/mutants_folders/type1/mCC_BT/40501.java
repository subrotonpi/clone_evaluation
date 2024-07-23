public static void main (String [] args) {

    List < String > list1 = new LinkedList < > (Arrays.asList ("Cat", "Mouse", "Dog"));

    List < String > list2 = new LinkedList < > (Arrays.asList ("Dog", "Mouse", "Cat"));

    List < String > list3 = new LinkedList < > (Arrays.asList ("Dog", "Horse", "Cat"));

    List < String > list4 = new LinkedList < > (Arrays.asList ("Dog", "Tiger", "Lion"));

    List < List < String > > list = new LinkedList < > (Arrays.asList (list1, list2, list3, list4));

    boolean flag = false;

    boolean matchFlag = true;

    for (int i = 0;

    i < list.size (); i ++) {

        for (int j = i + 1;

        j < list.size (); j ++) {

            if (list.get (i).size () == list.get (j).size ()) {

                matchFlag = true;

                for (String str : list.get (i)) {

                    flag = false;

                    for (String string : list.get (j)) {

                        if (str.equals (string)) {

                            flag = true;

                        }

                    }

                    if (flag == false) {

                        matchFlag = false;

                        break;

                    }

                }

                /* Comment */  if (matchFlag) {

                    list.remove (j);

                    j --;

                }

            }

        }

    }

    System.out.println (list.size ());

    for (int i = 0;

    i < list.size (); i ++) {

        System.out.println (list.get (i));

    }

}
