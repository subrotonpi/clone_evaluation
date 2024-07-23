public String GetFodlerSize () {

    String str = "";

    int Finalsize = 0;

    AWSCredentials credentials = new BasicAWSCredentials (accesskey, secretkey);

    AmazonS3 conn = new AmazonS3Client (credentials);

    ListObjectsRequest listObjectsRequest = new ListObjectsRequest ().withBucketName (BucketName).withPrefix (FolderName);

    ObjectListing X1;

    do {

        X1 = conn.listObjects (listObjectsRequest);

        for (S3ObjectSummary objectSummary : X1.getObjectSummaries ()) {

            str = (objectSummary.getSize () + "");

            int size = Integer.parseInt (str);

            Finalsize = Finalsize + size;

        }

        listObjectsRequest.setMarker (X1.getNextMarker ());

    } while (X1.isTruncated ());

    return FolderSize;

}
