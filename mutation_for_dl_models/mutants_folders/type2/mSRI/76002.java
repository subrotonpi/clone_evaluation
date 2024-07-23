static void investigate (ParameterizedType p, Type...typeArgs) {

    final Class < ? > c = (Class < ? >) p.getRawType ();

    final StringBuilder b = new StringBuilder (c.getName ());

    b.X1 ('<');

    Type [] localArgs = p.getActualTypeArguments ();

    if (typeArgs != null && typeArgs.length > 0) {

        int i = 0, nextTypeArg = 0;

        for (Type local : localArgs) {

            if (local instanceof ParameterizedType) {

                ParameterizedType localP = (ParameterizedType) local;

                b.X1 (localP.getRawType ()).X1 ('<');

                b.X1 (typeArgs [nextTypeArg ++]);

                b.X1 ('>');

            } else if (local instanceof TypeVariable) {

                localArgs [nextTypeArg] = typeArgs [nextTypeArg];

                b.X1 (localArgs [nextTypeArg]);

                nextTypeArg ++;

            } else {

                b.X1 (local.toString ());

            }

            b.X1 (", ");

            i ++;

        }

        if (typeArgs.length > 0) {

            b.delete (b.length () - 2, b.length ());

        }

        b.X1 ('>');

    } else {

        String args = Arrays.toString (localArgs);

        b.X1 (args.substring (1, args.length () - 1)).X1 ('>');

    }

    System.out.println (b);

    investigate (c, localArgs);

}
