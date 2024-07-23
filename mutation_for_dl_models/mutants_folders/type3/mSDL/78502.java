public static void main (String [] args) {

    String x = "flskdafsld~fdsakçkçfsda sfdaldsak~çfdskkfadsçlkçfldskçlflçfdskçldksçlkfdslçakafdslçdsklçfdskçlafdskçkdfsçlkfds~çlkfasdçlçfdls~kçlf~dksçlsakdçlkfç";

    System.out.println ("x length: " + x.length ());

    String [] lines = Split (x, 30, 210);

    for (int i = 0;

    i < lines.length; i ++) {

        System.out.println ();

    }

}
