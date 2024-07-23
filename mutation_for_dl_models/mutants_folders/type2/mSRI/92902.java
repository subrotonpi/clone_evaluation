@Override

public int compare (Integer o1, Integer X1) {

    if (o1 % 2 == 0) {

        if (X1 % 2 == 0) {

            if (o1 < X1) return - 1;

            else return 1;

        } else {

            return - 1;

        }

    } else {

        if (X1 % 2 != 0) {

            if (o1 < X1) return 1;

            else return - 1;

        } else {

            return 1;

        }

    }

}
