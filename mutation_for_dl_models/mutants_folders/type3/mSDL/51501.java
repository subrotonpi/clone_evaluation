public void add () {

    int newFeet = this.feet + d.feet;

    int newInches = this.inches + d.inches;

    if (newInches > 11) {

        newFeet ++;

        newInches = newInches - 12;

    }

    this.feet = newFeet;

    this.inches = newInches;

}
