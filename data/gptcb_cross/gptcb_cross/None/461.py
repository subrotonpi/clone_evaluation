def merge(a, l, r):
  totElem = len(l) + len(r)
  i, li,ri = 0, 0, 0
  while i < totElem:
    if li < len(l) and ri < len(r):
      if l[li] < r[ri]:
        a[i] = l[li]
        i += 1
        li += 1
      else:
        a[i] = r[ri]
        i += 1
        ri += 1
    else:
      if li >= len(l):
        while ri < len(r):
          a[i] = r[ri]
          i += 1
          ri += 1
      if ri >= len(r):
        while li < len(l):
          a[i] = l[li]
          li += 1
          i += 1