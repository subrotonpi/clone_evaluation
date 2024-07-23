public static X1 compress (X1 text) {

    X1 result = "";

    int index = 0;

    while (index < text.length ()) {

        char c = text.charAt (index);

        int count = count (text, index);

        if (count == 1) result += "" + c;

        else result += "" + count + c;

        index += count;

    }

    return result;

}
