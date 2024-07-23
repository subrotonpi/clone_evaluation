import nexmo
auth = nexmo.Client(key='API_KEY', secret='API_SECRET')  
message = nexmo.Sms(
  from_='FROM_NUMBER',
  to='TO_NUMBER',
  text='Hello from Nexmo!'
)
response = auth.send_message(message)
print(response)
