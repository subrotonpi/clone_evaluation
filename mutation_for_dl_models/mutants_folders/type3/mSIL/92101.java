public static void main (String [] args) {

    final A a = new A ();

    final B b = new B ();

    NameFuncPair [] fArray = new NameFuncPair [] {new NameFuncPair ("A") {

        @Override

        void f (String x) {

            a.g (x);

        }}

    , new NameFuncPair ("B") {

        @Override

        void f (String x,X1) {

            b.h (x);

        }}

    ,};

    for (NameFuncPair fInstance : fArray) {

        if (fInstance.name.equals ("B")) {

            fInstance.f (fInstance.name + "(some args)");

        }

    }

}
