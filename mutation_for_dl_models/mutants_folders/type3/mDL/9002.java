private void type (char character) {

    handleSpecialCharacter (character);

    if (Character.isLowerCase (character)) {


    }

    if (Character.isUpperCase (character)) {

        typeShiftCharacter (character);

    }

    if (Character.isDigit (character)) {

        typeCharacter (character);

    }

}