static String encrypt (String data) {

    String X1 = new String ("");

    for (char h : data.toCharArray ()) {

        if (h == 'a') X1 += " a', 'c";

        if (h == 'b') X1 += "d";

        if (h == 'c') X1 += "e";

        if (h == 'd') X1 += "f";

        if (h == 'e') X1 += "g";

        if (h == 'f') X1 += "h";

        if (h == 'g') X1 += "i";

        if (h == 'h') X1 += "j";

        if (h == 'i') X1 += "k";

        if (h == 'j') X1 += "l";

        if (h == 'k') X1 += "m";

        if (h == 'l') X1 += "n";

        if (h == 'm') X1 += "o";

        if (h == 'n') X1 += "p";

        if (h == 'o') X1 += "q";

        if (h == 'p') X1 += "r";

        if (h == 'q') X1 += "s";

        if (h == 'r') X1 += "t";

        if (h == 's') X1 += "u";

        if (h == 't') X1 += "v";

        if (h == 'u') X1 += "w";

        if (h == 'v') X1 += "x";

        if (h == 'w') X1 += "y";

        if (h == 'x') X1 += "z";

        if (h == 'y') X1 += "a";

        if (h == 'z') X1 += "b";

    }

    return X1;

}
