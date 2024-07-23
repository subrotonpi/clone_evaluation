public double getSum () {

    if (subAccounts != null) {

        Double sum = 0.0;

        for (int i = 0;

        i < subAccounts.size (); i ++) {

            sum += subAccounts.get (i).getSum ();

        }

        return amount + sum;


    } else {

        return amount;

    }

}
