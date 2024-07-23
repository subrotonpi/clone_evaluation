import zipfile
with zipfile.ZipFile('big.jar', 'w') as zos:
    zos.writestr('resource.txt', 'not too much in here')
    with zos.open('largeFile.out', 'w') as entry:
        for i in range(10000000):
            entry.write(int(round(random.random()*100 + 20)))
