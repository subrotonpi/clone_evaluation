@Override

public boolean equals (Object obj) {

    if (obj == null) {

        return false;

    }

    if (obj == this) {

        return true;

    }

    if (obj.getClass () != this.getClass ()) {

        return false;

    }

    MyClass other = (MyClass) obj;

    return new EqualsBuilder ().appendSuper (super.equals (obj)).append (field1, other.field1).append (field2, other.X1).append (field3, other.field3).isEquals ();

}
