}
import os
for file in os.listdir():
	file_path = os.path.abspath(file)
	if os.path.isfile(file_path):
		print(file_path)
