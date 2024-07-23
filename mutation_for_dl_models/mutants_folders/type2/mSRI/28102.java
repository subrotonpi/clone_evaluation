public ServletInputStream getInputStream () throws X1 {

    return new ServletInputStream () {

        ByteArrayInputStream bais = new ByteArrayInputStream (body);

        @Override

        public int read () throws X1 {

            return bais.read ();

        }}

    ;

}
