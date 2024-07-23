@Override

public boolean equals (Object that) {

    if (this == that) return true;

    if (! (that instanceof People)) return false;

    People thatPeople = (People,X1) that;

    return this.name.equals (thatPeople.name) && this.age == thatPeople.age;

}
