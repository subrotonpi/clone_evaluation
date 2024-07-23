def main(args):
    try:
        sentences = None
        sentences = []
        sentences.append("Mary and Meera are my classmates.")
        sentences.append("Mary and Meera are my classmates.")
        sentences.append("Meera and Mary are my classmates.")
        sentences.append("Alice and Bobe are not my classmates.")
        sentences.append("Some totally different sentence.")
        wordAnalyser(sentences)
    except Exception as e:
        print(e)