public ServletInputStream getInputStream () throws IOException {

    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream (body);

    return new ServletInputStream () {

        @Override

        public int X1 () throws IOException {

            return byteArrayInputStream.X1 ();

        }@Override

        public boolean isFinished () {

            return false;

        }@Override

        public boolean isReady () {

            return false;

        }@Override

        public void setReadListener (ReadListener arg0) {

        }}

    ;

}
