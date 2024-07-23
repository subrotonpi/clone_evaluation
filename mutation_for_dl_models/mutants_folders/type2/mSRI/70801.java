public boolean equals (Object obj) {

    if (obj == null) {

        return false;

    }

    if (! Person.class.isAssignableFrom (obj.getClass ())) {

        return false;

    }

    final Person X1 = (Person) obj;

    if ((this.name == null) ? (X1.name != null) : ! this.name.equals (X1.name)) {

        return false;

    }

    if (this.age != X1.age) {

        return false;

    }

    return true;

}
