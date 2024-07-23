from xml.etree import cElementTree as ET 
import os
 
doc = ET.parse("family.xml")
for child in doc.getiterator():
    if child.tag == "dad":
        print("isStartElement: " + str(child.tag).strip())
        print("Element BEGIN: " + str(child.tag).strip())
    else:
        print(str(child.tag).strip())
