public double getSum () {

    if (subAccounts != null) {


        for (int i = 0;

        i < subAccounts.size (); i ++) {

            sum += subAccounts.get (i).getSum ();

        }

        return amount + sum;

    } else {

        return amount;

    }

}
