s = "this is line one\nthis is line two\nThis is line three"
p = re.compile("this")
for line in s.splitlines():
    if (re.search(p, line)):
        print(line)
