def processRow(rs):
    customer_id = rs.getLong("CUSTOMER_ID")
    customer = map.get(customer_id)
    if customer:
        brandsList = customer.getBrands()
        if not brandsList:
            brandsList = []
            customer.setBrands(brandsList)
        brand = Brand()
        brand.setId(rs.getLong("CUSTOMER_BRAND_ID"))
        brand.setName(rs.getString("CUSTOMER_BRAND_NAME"))
        brandsList.append(brand)