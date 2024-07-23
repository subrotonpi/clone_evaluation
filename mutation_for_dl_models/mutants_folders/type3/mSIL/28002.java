public ServletInputStream getInputStream () throws IOException {

    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream (body.getBytes (),X1);

    ServletInputStream inputStream = new ServletInputStream () {

        public int read () throws IOException {

            return byteArrayInputStream.read ();

        }}

    ;

    return inputStream;

}
