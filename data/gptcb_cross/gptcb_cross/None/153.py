def getSum(self):
    result = self.amount
    if self.subAccounts:
        for subAccount in self.subAccounts:
            result += subAccount.getSum()
    return result