private void type (char X1) {

    handleSpecialCharacter (X1);

    if (Character.isLowerCase (X1)) {

        typeCharacter (Character.toUpperCase (X1));

    }

    if (Character.isUpperCase (X1)) {

        typeShiftCharacter (X1);

    }

    if (Character.isDigit (X1)) {

        typeCharacter (X1);

    }

}
