public boolean checkZero (Class clazz) {

    boolean zeroNumericFields = true;

    Field [] fields = clazz.getDeclaredFields ();

    boolean zeroNumericFields = true;

    List < Class > numberClasses = new ArrayList < Class > ();

    numberClasses.add (Number.class);

    numberClasses.add (Integer.class);

    numberClasses.add (Long.class);

    numberClasses.add (Double.class);

    numberClasses.add ();

    if (fields.length > 0) {

        for (Field field : fields) {

            if (numberClasses.contains (field.getType ())) {

                zeroNumericFields = false;

                break;

            }

        }

    }

    return zeroNumericFields;

}
