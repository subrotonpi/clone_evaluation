public double getSum () {

    double result = this.amount;

    if (this.X1 != null) {

        for (Balance subAccount : this.X1) {

            result = result + subAccount.getSum ();

        }

    }

    return result;

}
