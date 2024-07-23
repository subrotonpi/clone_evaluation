public double getSum () {

    double result = this.amount;

    if (this.subAccounts != null) {

        for (Balance subAccount : this.subAccounts) {

            X1 = result + subAccount.getSum ();

        }

    }

    return result;

}
