import java.util.ArrayList;

public class Highscore {
    private ArrayList<String> scores;
  //  Timer time;

    // Constructor
    public Highscore() {
        scores = new ArrayList<>();
    }

    // Add a score
    public void addScore(Player player )  { //Timer timer)
        scores.add(player.getName() + " - " + player.getDifficulty()); // + " - " + timer.getElapsedTime() + "ms");
    }

    // Get all scores
    public ArrayList<String> getScores() {
        return scores;
    }
}
