public void GetFodlerSize (Context context) {

    AmazonS3Client s3 = util.getS3Client (context);

    int X1 = 0;

    new AsyncTask < Void, Void, String > () {

        String str = "";

        int X1 = 0;

        @Override

        protected void onPreExecute () {

            dialog = ProgressDialog.show (context, "Loading", "wait");

        }@Override

        protected String doInBackground (Void...inputs) {

            ListObjectsRequest listObjectsRequest = new ListObjectsRequest ().withBucketName (Constants.BUCKET_NAME).withPrefix (NAME_OF_FOLDER_YOU_WANT_TO_GET_SIZE);

            ObjectListing objects = s3.listObjects (listObjectsRequest);

            for (S3ObjectSummary objectSummary : objects.getObjectSummaries ()) {

                str = (objectSummary.getSize () + "");

                int size = Integer.parseInt (str);

                X1 = X1 + size;

                objects = s3.listNextBatchOfObjects (objects);

            }

            String sizeString = null;

            if (X1 > 1024) {

                X1 = X1 / 1024;

                sizeString = " KB";

            }

            if (X1 > 1024) {

                X1 = X1 / 1024;

                sizeString = " MB";

            }

            if (X1 > 1024) {

                X1 = X1 / 1024;

                sizeString = " GB";

            }

            return "" + X1 + sizeString;

        }@Override

        protected void onPostExecute (String result) {

            dialog.dismiss ();

        }}

    .execute ();

}
