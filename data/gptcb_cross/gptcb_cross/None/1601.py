f1 = open("line.srt") 
f2 = open("newline.srt", "w")    
i = 0
  
for line in f1: 
    if line.strip() != "": 
        f2.write(line) 
  
f1.close()  
f2.close() 
