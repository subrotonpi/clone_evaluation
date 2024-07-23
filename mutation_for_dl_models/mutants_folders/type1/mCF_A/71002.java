private static void drawTable (PDPage page, PDPageContentStream contentStream) {

    try {

        float y = 650;

        float margin = 130;

        String [] content = {"One", "Two", "Date", "Score", "Score2", "Score3", "Score4", "Score5", "Score6"};

     
   final int rows = content.length;

        final int cols = 2;

        final float rowHeight = 22f;

        final float tableWidth = 900.0f;

        final float tableHeight = rowHeight * rows;

        final float cellMargin = 1f;

        float nexty = y;

        for (int i = 0;

        i <= rows; i ++) {

            contentStream.drawLine (margin, nexty, 400, nexty);

            nexty -= rowHeight;

        }

        float colWidthX [] = {200, 70, 0};

        float nextx = margin;

        for (int i = 0;

        i <= cols; i ++) {

            contentStream.drawLine (nextx, y, nextx, y - tableHeight);

            nextx += colWidthX [i];

        }

        float textx = margin + cellMargin;

        float texty = y - 15;

        for (int j = 0;

        j < rows; j ++) {

            contentStream.beginText ();

            contentStream.moveTextPositionByAmount (textx, texty);

            contentStream.drawString (content [j]);

            contentStream.endText ();

            textx += colWidthX [0] + 9;

            contentStream.beginText ();

            contentStream.moveTextPositionByAmount (textx, texty);

            if (j == 0) contentStream.drawString ("1");

            if (j == 1) contentStream.drawString ("12345");

            if (j == 2) contentStream.drawString ("05-December-2003");

            if (j == 3) contentStream.drawString ("15");

            if (j == 4) contentStream.drawString ("1");

            if (j == 5) contentStream.drawString ("1");

            if (j == 6) contentStream.drawString ("1");

            if (j == 7) contentStream.drawString ("1");

            if (j == 8) contentStream.drawString ("1");

            contentStream.endText ();

            textx = margin + cellMargin;

            texty -= rowHeight;

        }

        texty -= rowHeight;

        textx = margin + cellMargin;

    } catch (IOException ioe) {

        final String errormsg = "Could not drawTable ";

        throw new RuntimeException (errormsg, ioe);

    } catch (Exception ex) {

        final String errormsg = "Could not drawTable ";

        throw new RuntimeException (errormsg, ex);

    }

}
