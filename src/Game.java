public class Game {

    Timer timer;
    Highscore highscore;
    Player player;
    PlayArea playArea;


    public Game(Timer timer, Highscore highscore, Player player, PlayArea playArea) {
        this.timer = timer;
        this.highscore = highscore;
        this.player = player;
        this.playArea = playArea;
    }

    public void startGame() {

    }

    public void endGame() {

    }

    public Highscore getHighscore() {
        return highscore;
    }
}
