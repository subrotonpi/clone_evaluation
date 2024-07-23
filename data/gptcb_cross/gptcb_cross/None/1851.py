def processRow(rs):
  id = rs.getLong("CUSTOMER_ID")
  customer = map.get(id)
  if customer != None:
    orders_list = customer.getOrders()
    
    if orders_list == None:
      orders_list = []
      customer.setOrders(orders_list)
    
    order = Order()
    order.setId(rs.getLong("ORDER_ID"))
    orders_list.append(order)