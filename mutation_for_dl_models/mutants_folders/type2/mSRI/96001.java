public String startOz (String str) {

    if (str != null) {

        char [] X1 = str.toLowerCase ().toCharArray ();

        boolean oTest = X1.length >= 1 && X1 [0] == 'o';

        boolean zTest = X1.length >= 2 && X1 [1] == 'z';

        if (oTest && zTest) {

            return "oz";

        } else if (oTest) {

            return "o";

        } else if (zTest) {

            return "z";

        }

    }

    return "";

}
