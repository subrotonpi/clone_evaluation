public ServletInputStream getInputStream () throws IOException {

    return new ServletInputStream () {

        ByteArrayInputStream bais = new ByteArrayInputStream ();

        @Override

        public int read () throws IOException {

            return bais.read ();

        }}

    ;

}
