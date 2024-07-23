public static void main (String [] args) {

    String x = "flskdafsld~fdsakçkçfsda sfdaldsak~çfdskkfadsçlkçfldskçlflçfdskçldksçlkfdslçakafdslçdsklçfdskçlafdskçkdfsçlkfds~çlkfasdçlçfdls~kçlf~dksçlsakdçlkfç";

    X1.out.println ("x length: " + x.length ());

    String [] lines = Split (x, 30, 210);

    for (int i = 0;

    i < lines.length; i ++) {

        X1.out.println ("lines[" + i + "]: (len: " + lines [i].length () + ") : " + lines [i]);

    }

}
