def afterTextChanged(text):
    cost = text.strip()
    if not cost.endswith('.') and '.' in cost:
        numberBeforeDecimal, numberAfterDecimal = cost.split('.')
        if len(numberAfterDecimal) > 2:
            numberAfterDecimal = numberAfterDecimal[:2]
        cost = numberBeforeDecimal + '.' + numberAfterDecimal
 
    costEditText.removeTextChangedListener(this)
    costEditText.setText(cost)
    costEditText.setSelection(len(costEditText.getText().strip()))
    costEditText.addTextChangedListener(this)