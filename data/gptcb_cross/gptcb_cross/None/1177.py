def initData():
   testData = [] 
   testData.append(EventStatus("Mach-1", 1477468500000L, 1, 0)) 
   testData.append(EventStatus("Mach-1", 1477472100000L, 2, 0)) 
   testData.append(EventStatus("Mach-1", 1477474200000L, 5, 0)) 
   testData.append(EventStatus("Mach-1", 1477476000000L, 3, 0))
   testData.append(EventStatus("Mach-1", 1477479600000L, 4, 0)) 
   testData.append(EventStatus("Mach-1", 1477486800000L, 1, 0)) 
   testData.append(EventStatus("Mach-2", 1477465200000L, 3, 1)) 
   testData.append(EventStatus("Mach-2", 1477472400000L, 2, 1))
   testData.append(EventStatus("Mach-2", 1477474200000L, 5, 1)) 
   testData.append(EventStatus("Mach-2", 1477476000000L, 2, 1))
   testData.append(EventStatus("Mach-2", 1477479600000L, 3, 1)) 
   testData.append(EventStatus("Mach-2", 1477486800000L, 4, 1)) 

   list = [] 
   for eventStatus in testData: 
       if eventStatus.getName() in list: 
           continue 
       else: 
           list.append(eventStatus.getName()) 

   catArray = [len(list)] 
   catArray = list.toArray(catArray)