from zipfile import *
with ZipFile('big.jar', 'w') as zf:
    zf.write('resource.txt', compress_type=ZIP_DEFLATED)
    with zf.open('resource.txt', 'w') as wf:
        wf.write(b"not too much in here") 
    zf.write('largeFile.out', compress_type=ZIP_DEFLATED)
    with zf.open('largeFile.out', 'w') as wf:
        for i in range(10000000):
            wf.write(int(round(random.random()*100)+20)) 
 
