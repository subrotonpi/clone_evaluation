def main(args): 
    input = "(A,Name1,200), (A,Name1,200), (R,Name1,200), (A,Name2,900), (A,Name2,500)"
    score_sets = input.split("),")
    score_list = []
    for score_set in score_sets: 
        trimmed_score = score_set.strip()[1:]
        close_brace_index = trimmed_score.find(')')
        score_text = trimmed_score[:close_brace_index] if close_brace_index == len(trimmed_score) - 1: 
            score_tokens = score_text.split (",")
            score_list.append(Score(score_tokens[0], score_tokens[1], float(score_tokens[2])))