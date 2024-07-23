def call():
    game_GUI.indicate_dice_roll(dice_roll)
    new_index = get_player_index_after_roll(dice_roll)
    move_scheduled_future = move(new_index)
    
    if (move_scheduled_future != None):
        move_scheduled_future.get()

    print("change turns")
    swap_turns()
    print(is_computer_turn())
    game_GUI.update_current_turn_label()

    if (new_index == Game_Board.WIN_POINT):
        restart_game = game_board.play_again_or_exit()
        
        if (restart_game):
            winner = game_board.get_current_player()
            game_GUI.update_score(winner)
            game_GUI.play_again()
        else:
            sys.exit(0)