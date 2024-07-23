public String startOz (String str,X1) {

    if (str != null) {

        char [] arr = str.toLowerCase ().toCharArray ();

        boolean oTest = arr.length >= 1 && arr [0] == 'o';

        boolean zTest = arr.length >= 2 && arr [1] == 'z';

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
