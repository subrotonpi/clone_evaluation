public static void main (String [] args) {

    final A a = new A ();

    final B b = new B ();

    NameFuncPair [] fArray = new NameFuncPair [] {new NameFuncPair ("A") {

        @X1

        void f (String x) {

            a.g (x);

        }}

    , new NameFuncPair ("B") {

        @X1

        void f (String x) {

            b.h (x);

        }}

    ,};

    for (NameFuncPair fInstance : fArray) {

        if (fInstance.name.equals ("B")) {

            fInstance.f (fInstance.name + "(some args)");

        }

    }

}
