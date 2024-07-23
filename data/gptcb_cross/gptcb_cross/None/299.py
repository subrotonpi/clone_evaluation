def main (args):
  t = Test ()
  all_query_strings = ["INSERT INTO `TABLENAME` VALUES(xxx,yyy,zzz);", "INSERT INTO `TABLENAME` VALUES(xxx,yyy,zzz),(aaa,bbb,ccc);", "INSERT INTO `TABLENAME` VALUES(xxx,yyy,zzz),(aaa,'bb(,)b',ccc);", "INSERT INTO `TABLENAME` VALUES(xxx,yyy,zzz),(aaa,'bb),(b',ccc);"]
  
  for query_string in all_query_strings:
    print (query_string)
    for value in t.extract_values (query_string):
      print (value)