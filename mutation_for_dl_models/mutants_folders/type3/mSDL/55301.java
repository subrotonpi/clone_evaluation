static boolean areAnagrams (CharSequence a, CharSequence b) {

    int len = a.length ();

    if (len != b.length ()) return false;

    Map < Integer, Integer > ocr = new HashMap < > (64);

    a.codePoints ().forEach (c -> ocr.merge (c, 1));

    for (int i = 0, c = 0;

    i < len; i += Character.charCount (c)) {

        int cc = ocr.getOrDefault ((c = Character.codePointAt (b, i)), 0);

        if (cc == 0) return false;

        ocr.put (c, cc - 1);

    }

    return true;

}
