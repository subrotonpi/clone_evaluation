sharedObject = object()
sampleA = MyClass()
sampleA.myObject = sharedObject
sampleB = MyClass()
sampleB.myObject = sharedObject
print(sampleA.sharedObject is sampleB.sharedObject)
print(sampleA is sampleB) 
