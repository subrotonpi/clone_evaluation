def getView(self, position, convertView, parent):
    convertView = self.mInflater.inflate(R.layout.listview_row, None)
    tvTimer = convertView.findViewById(R.id.textview_timer)
    tvName = convertView.findViewById(R.id.textview_name)
    item = self.data[position]
    tvName.setText(item.getName())
    myTimer.setTimer(tvTimer, item.getTime())
    return convertView