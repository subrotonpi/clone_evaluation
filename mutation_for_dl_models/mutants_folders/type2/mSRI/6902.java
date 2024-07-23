public static void main (X1 [] args) {

    Test t = new Test ();

    X1 [] allQueryStrings = new X1 [] {"INSERT INTO `TABLENAME` VALUES(xxx,yyy,zzz);", "INSERT INTO `TABLENAME` VALUES(xxx,yyy,zzz),(aaa,bbb,ccc);", "INSERT INTO `TABLENAME` VALUES(xxx,yyy,zzz),(aaa,'bb(,)b',ccc);", "INSERT INTO `TABLENAME` VALUES(xxx,yyy,zzz),(aaa,'bb),(b',ccc);"};

    for (X1 queryString : allQueryStrings) {

        System.out.println (queryString);

        for (X1 values : t.extractValues (queryString)) {

            System.out.println (values);

        }

    }

}
