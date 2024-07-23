def merge(*strings):
     max_length = 0

     for s in strings:
          if len(s) > max_length:
               max_length = len(s)

     result = ""

     for i in range(max_length):
          for s in strings:
               if len(s) > i:
                    result = result + s[i]

     return result