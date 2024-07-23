private void type (char character) {

    handleSpecialCharacter (character);

    if (Character.isLowerCase (character)) {

        typeCharacter (Character.toUpperCase (character));

    }

    if (Character.isUpperCase (character)) {

        typeShiftCharacter (character);

    } /* Comment */ 

    if (Character.isDigit (character)) {

        typeCharacter (character);

    }

}
