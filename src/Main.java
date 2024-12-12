import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Maak een speler aan
        Player player = new Player("Alice", "Medium");
        System.out.println(player);

        // Maak een lijst van scores
        List<Long> initialScores = new ArrayList<>();
        initialScores.add(12000L);
        initialScores.add(15000L);

        // Maak een highscore-object aan
        Highscore highscore = new Highscore(player.getName(), player.getDifficulty(), initialScores);
        System.out.println(highscore);

        // Voeg een nieuwe score toe
        highscore.addScore(10000L);
        System.out.println("Updated Highscore: " + highscore);
    }
}