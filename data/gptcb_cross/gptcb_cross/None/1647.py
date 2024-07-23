def generate(session, object):
    result = None 
    connection = None 
    statement = None 
    resultSet = None 
    prefix = 'emp'
    try: 
        connection = session.connection()
        statement = connection.createStatement()
        try: 
            resultSet = statement.executeQuery('SELECT next_val FROM ' + DEFAULT_SEQUENCE_NAME)
        except Exception as e: 
            print('In catch, cause: Table is not available.')
            statement.execute('CREATE table ' + DEFAULT_SEQUENCE_NAME + ' (next_val INT NOT NULL)')
            statement.executeUpdate('INSERT INTO ' + DEFAULT_SEQUENCE_NAME + ' VALUES(0)')
            statement.executeUpdate('UPDATE ' + DEFAULT_SEQUENCE_NAME + ' SET next_val=LAST_INSERT_ID(next_val+1)') 
            resultSet = statement.executeQuery('SELECT next_val FROM ' + DEFAULT_SEQUENCE_NAME)
        if resultSet.next():
            nextValue = resultSet.getInt(1)
            suffix = '{:04d}'.format(nextValue)
            result = prefix + suffix
            print('Custom generated sequence is: ' + result)
    except SQLException as e:
        e.printStackTrace()
    return result