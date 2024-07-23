def filter(self, source, start, end, dest, dstart, dend):
    ls_start = ""
    ls_insert = ""
    ls_end = ""
    ls_text = ""
    print("debug: ", self.mo_pattern)
    print("debug: source: " + source + ", start: " + str(start) + ", end:" + str(end) +
          ", dest: " + dest + ", dstart: " + str(dstart) + ", dend: " + str(dend))
    ls_text = dest.toString()
    if len(ls_text) > 0:
        ls_start = ls_text[0:dstart]
        print("debug: lsStart : " + ls_start)
        if source != "":
            ls_insert = source
            print("debug: lsInsert: " + ls_insert)
        ls_end = ls_text[dend:]
        print("debug: lsEnd   : " + ls_end)
        ls_text = ls_start + ls_insert + ls_end
        print("debug: lsText  : " + ls_text)
    lo_matcher = self.mo_pattern.match(ls_text)
    print("debug: loMatcher.matches(): " + str(lo_matcher.matches()) + ", lsText: " + ls_text)
    if not lo_matcher.matches():
        return ""
    return None