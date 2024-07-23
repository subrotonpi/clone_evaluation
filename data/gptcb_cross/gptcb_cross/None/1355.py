import json 
with open("test.json", "r") as f:
    tweets = json.load(f)
print("Java object created from JSON String :") 
for tweet in tweets: 
    print(tweet) 
