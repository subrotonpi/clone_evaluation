def randNums(total,n):
        results = [0]*n
        if total == 0:
            return results
        rs = [0]*n
        totalPlus1 = total+1
        while(True):
            for i in range(n):
                # Generate a random integer in between 0 and 256.
                rs[i] = random.randint(0,256)
            sum = 0
            for i in range(n):
                sum += rs[i]
            if sum == 0:
                continue
            for i in range(n):
                results[i] = sum%rs[i]%totalPlus1
            break
        return results