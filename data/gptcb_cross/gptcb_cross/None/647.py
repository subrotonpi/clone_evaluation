def main(args):
    st1 = "2015-07-24T09:39:14.000Z"
    st2 = "2015-07-24T09:45:44.000Z"
    time1 =st1[st1.index("T")+1:st1.index(".0")]
    time2 = st2[st2.index("T")+1:st2.index(".0")]
    dateTime1 = datetime.datetime.strptime(time1,"%H:%M").time()
    dateTime2 = datetime.datetime.strptime(time2,"%H:%M").time()
    print dateTime1>dateTime2