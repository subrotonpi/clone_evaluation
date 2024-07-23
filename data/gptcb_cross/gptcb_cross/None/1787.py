def layout_plot_children(self): 
    super().layout_plot_children() 
    for series in self.get_data(): 
        for data in series.get_data(): 
            bar = data.get_node() 
            label = None
            for node in bar.get_children_unmodifiable(): 
                print("Bar has child {}, {}.".format(node, node.class_name())) 
                if isinstance(node, Label): 
                    label = node 
                    break 
            
            if label is None: 
                label = Label(series.get_name())
                label.set_rotate(90.0) 
                bar.get_children().add(label) 
            else:
                label.set_text(series.get_name())