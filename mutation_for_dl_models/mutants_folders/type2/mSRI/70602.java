public boolean equals (Object obj) {

    if (obj == null) {

        return false;

    }

    if (! Person.class.isAssignableFrom (obj.getClass ())) {

        return false;

    }

    final Person other = (Person) obj;

    if ((this.X1 == null) ? (other.X1 != null) : ! this.X1.equals (other.X1)) {

        return false;

    }

    if (this.age != other.age) {

        return false;

    }

    return true;

}
