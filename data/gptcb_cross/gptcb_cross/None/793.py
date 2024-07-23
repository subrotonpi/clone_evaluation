def export_done(c, data, action):
   if action == MOVE and indices != None:
      model = source.getModel()
      for i in reversed(range(len(indices))):
         model.remove(indices[i])
   if addCount > 0:
      for i in range(len(indices)):
         if indices[i] > addIndex:
            indices[i] += addCount
      indices = None
      addIndex = -1
      addCount = 0