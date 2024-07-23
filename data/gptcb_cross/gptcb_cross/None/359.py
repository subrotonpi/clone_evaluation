def changed(observable, old_value, new_value):
    if old_value.get_height() != new_value.get_height():
        print('new_value = {}'.format(new_value.get_height()))
        old_value.set_height(new_value.get_height())
        text_area.set_pref_height(text_holder.get_layout_bounds().get_height() + 20)