def main():
   characters = []
   for i in range(ord('a'), ord('z')+1):
      characters.append(chr(i))

   allStrings = []
   for c in characters:
      for d in characters:
         for e in characters:
            for f in characters:
               s = c+d+e+f
               allStrings.append(s)

   print(len(allStrings))

if __name__ == "__main__":
   main()