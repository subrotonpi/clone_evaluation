def play_wav(filepath):
     with closing(wave.open(filepath,'r')) as f:
        frames = f.getnframes()
        rate = f.getframerate()
        duration = frames / float(rate)
        playsound(filepath)

try:
        sound_path = "C:\\Users\\Public\\Music\\Sample Music\\Kalimba.wav"
        play_wav(sound_path)
finally:
        print("...")