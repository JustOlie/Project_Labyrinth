import java.util.ArrayList;
import java.util.List;
public class Highscore extends Player {
    private List<Long> scores; // Lijst van scores

    // Constructor
    public Highscore(String name, String difficulty, List<Long> scores) {
        super(name, difficulty);
        this.scores = new ArrayList<>(scores); // Defensieve kopie
    }

    // Methode om een score toe te voegen
    public void addScore(long score) {
        scores.add(score);
    }

    // Getter voor scores
    public List<Long> getScores() {
        return new ArrayList<>(scores); // Defensieve kopie
    }

    // toString Method
    @Override
    public String toString() {
        return super.toString() + ", Highscores=" + scores;
    }
}
