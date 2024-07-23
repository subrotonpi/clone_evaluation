initial_numbers = [1,2]
observable_initial = Observable.from(initial_numbers)
subject = ReplaySubject.create()
source = Observable.merge(observable_initial, subject)
source.subscribe(print)
for i in range (100):
  subject.onNext(i)
  
