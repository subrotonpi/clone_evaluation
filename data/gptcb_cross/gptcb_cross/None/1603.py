def main():
  try:
    game = Chess();
    t1 = threading.Thread(target=game.run())
    t1.start()
    time.sleep(1000)
    game.setRunGame(False)
    time.sleep(1000)
    game = TicTacToe()
    t2 = threading.Thread(target=game.run())
    t2.start()
    time.sleep(1000)
    game.setRunGame(False)
  except Exception as err:
    print(err.stack_trace())