@Override

public int hashCode () {

    int result = 17;

    result = 31 * result + (booleanField ? 1 : 0);

    result = 31 * result + byteField;

    result = 31 * result + charField;

    result = 31 * result + shortField;

    result = 31 * result + intField;

    result = 31 * result + (int) (longField ^ (longField>>> 32));
 
    result = 31 * result + Float.floatToIntBits (floatField);

    long doubleFieldBits = Double.doubleToLongBits (doubleField);

    result = 31 * result + (int) (doubleFieldBits ^ (doubleFieldBits>>> 32));

    result = 31 * result + Arrays.hashCode (arrayField);

    result = 31 * result + referenceField.hashCode ();

    result = 31 * result + (nullableReferenceField == null ? 0 : nullableReferenceField.hashCode ());

    return result;

}
