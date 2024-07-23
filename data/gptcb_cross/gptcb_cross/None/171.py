def main(args):
    x = "flskdafsld~fdsakçkçfsda sfdaldsak~çfdskkfadsçlkçfldskçlflçfdskçldksçlkfdslçakafdslçdsklçfdskçlafdskçkdfsçlkfds~çlkfasdçlçfdls~kçlf~dksçlsakdçlkfç"
    print("x length: ",len(x))
 
    lines = Split(x, 30, 210)
    for i in range(0,len(lines)):
        print("lines[i]: (len: ", len(lines[i]), ") : ", lines[i])