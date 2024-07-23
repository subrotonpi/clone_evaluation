import os
if os.isatty(0):
    sortNames = SortNames()
    sortNames.run()
else:
    print("Sorry, no console.")
    exit(1)
