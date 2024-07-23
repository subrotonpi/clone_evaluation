public ServletInputStream getInputStream () throws IOException {

    final X1 byteArrayInputStream = new X1 (body.getBytes ());

    ServletInputStream inputStream = new ServletInputStream () {

        public int read () throws IOException {

            return byteArrayInputStream.read ();

        }}

    ;

    return inputStream;

}
