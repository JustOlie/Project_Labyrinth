public class Player {
    private String name; // Spelernaam
    private String difficulty; // Moeilijkheidsgraad

    // Constructor
    public Player(String name, String difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }

    // Getters en Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

}
