@Override

public int compare (Integer o1, Integer o2) {

    if (o1 % 2 == 0) {

        if (o2 % 2 == 0) {

            if (o1 < o2) return - 1;

            else return 1;

        } else {

            return - 1;

        }

    } else {

        if (o2 % 2 != 0) {
             if (o1 < o2) return 1;

            else return - 1;

        } else {

            return 1;

        }

    }

}
