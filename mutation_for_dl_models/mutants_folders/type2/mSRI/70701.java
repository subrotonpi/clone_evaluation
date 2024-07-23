@Override

public boolean equals (Object that) {

    if (this == that) return true;

    if (! (that instanceof People)) return false;

    People thatPeople = (People) that;

    return this.X1.equals (thatPeople.X1) && this.age == thatPeople.age;

}
