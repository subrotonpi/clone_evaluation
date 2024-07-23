public double getSum () {

    double result = this.amount;

    if (this.subAccounts != null) {

        for (Balance subAccount : this.subAccounts) {

            result = result + subAccount.getSum (X1);

        }

    }

    return result;

}
