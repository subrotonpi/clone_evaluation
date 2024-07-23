import os
source = os.getcwd() + os.sep + 'Code.txt'
dest = os.getcwd() + os.sep + 'Dest.txt'
with open(source) as infile, open(dest, 'w') as outfile:
    for line in infile:
        outfile.write(line)
