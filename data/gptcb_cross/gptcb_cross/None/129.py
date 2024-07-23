def transform(font_old):
  font_new = workbook_new.createFont()
  font_new.setBoldweight(font_old.getBoldweight())
  font_new.setCharSet(font_old.getCharSet())
  font_new.setColor(font_old.getColor())
  font_new.setFontName(font_old.getFontName())
  font_new.setFontHeight(font_old.getFontHeight())
  font_new.setItalic(font_old.getItalic())
  font_new.setStrikeout(font_old.getStrikeout())
  font_new.setTypeOffset(font_old.getTypeOffset())
  font_new.setUnderline(font_old.getUnderline())

  return font_new