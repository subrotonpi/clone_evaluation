import os, shutil
source_dir = '/path/to/source/dir'
dest_dir = '/path/to/dest/dir'
sources = [os.path.join(source_dir,f) for f in os.listdir(source_dir)]
destinations = [os.path.join(dest_dir,f) for f in os.listdir(source_dir)]
for i in range(len(sources)):
    shutil.copy(sources[i], destinations[i])
