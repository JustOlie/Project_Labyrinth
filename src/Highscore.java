import java.util.ArrayList;

public class Highscore {
    private ArrayList<String> scores;

    // Constructor
    public Highscore() {
        scores = new ArrayList<>();
    }

    // Add a score
    public void addScore(String name, String difficulty, long time) {
        scores.add(name + " - " + difficulty + " - " + time + "ms");
    }

    // Get all scores
    public ArrayList<String> getScores() {
        return scores;
    }
}
