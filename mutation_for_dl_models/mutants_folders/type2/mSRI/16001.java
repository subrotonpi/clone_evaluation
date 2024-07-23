public boolean checkZero (Class clazz) {

    boolean X1 = true;

    Field [] fields = clazz.getDeclaredFields ();

    boolean X1 = true;

    List < Class > numberClasses = new ArrayList < Class > ();

    numberClasses.add (Number.class);

    numberClasses.add (Integer.class);

    numberClasses.add (Long.class);

    numberClasses.add (Double.class);

    numberClasses.add (Float.class);

    if (fields.length > 0) {

        for (Field field : fields) {

            if (numberClasses.contains (field.getType ())) {

                X1 = false;

                break;

            }

        }

    }

    return X1;

}
