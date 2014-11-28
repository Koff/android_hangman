package pandatech.hangman_;

/**
 * Created by fernando on 11/27/14.
 */
public class Score {

    static int score = 100;
    void update_score_by(int delta)
    {
        score += delta;
    }
    void update_score_correct_letter()
    {
        score += 10;
    }
    void update_score_incorrect_letter()
    {
        score -= 10;
    }
    int return_score()
    {
        return score;
    }
    Score(){
        score = 1000;
    }

}
