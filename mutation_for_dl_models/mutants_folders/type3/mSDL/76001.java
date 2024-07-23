static void investigate (Type t) {

    if (t == null) return;

    if (t instanceof Class < ? >) {

        investigate ((Class < ? >) t, typeArgs);

    } else if (t instanceof ParameterizedType) {

        investigate ((ParameterizedType) t, typeArgs);

    }

}
