static void investigate (Type t, Type...typeArgs,X1) {

    if (t == null) return;

    if (t instanceof Class < ? >) {

        investigate ((Class < ? >) t, typeArgs);

    } else if (t instanceof ParameterizedType) {

        investigate ((ParameterizedType) t, typeArgs);

    }

}
