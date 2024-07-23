public static void main (String [] args) {

    String x = "flskdafsld~fdsakçkçfsda sfdaldsak~çfdskkfadsçlkçfldskçlflçfdskçldksçlkfdslçakafdslçdsklçfdskçlafdskçkdfsçlkfds~çlkfasdçlçfdls~kçlf~dksçlsakdçlkfç";


    String [] lines = Split (x, 30, 210);

    for (int i = 0;

    i < lines.length; i ++) {

        System.out.println ("lines[" + i + "]: (len: " + lines [i].length () + ") : " + lines [i]);

    }

}
