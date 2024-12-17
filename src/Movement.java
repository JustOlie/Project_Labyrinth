public class Movement {
    private PlayArea playArea; // Referentie naar het speelveld
    private int x; // Huidige X-coördinaat
    private int y; // Huidige Y-coördinaat


    public Movement(PlayArea playArea, int startX, int startY) {
        this.playArea = playArea;
        this.x = startX;
        this.y = startY;
    }

    // Methode om de huidige positie te bepalen
    public void setPositie(int newX, int newY) {
        if (isValidPosition(newX, newY)) {
            this.x = newX;
            this.y = newY;
        } else {
            System.out.println("Ongeldige positie!");
        }
    }

    // Methoden om te omhoog bewegen
    public void moveUp() {
        if (isValidPosition(x - 1, y)) {
            x -= 1;
        }
    }

    // Methoden om te omlaag bewegen
    public void moveDown() {
        if (isValidPosition(x + 1, y)) {
            x += 1;
        }
    }

    public void moveLeft() {
        if (isValidPosition(x, y - 1)) {
            y -= 1;
        }
    }

    public void moveRight() {
        if (isValidPosition(x, y + 1)) {
            y += 1;
        }
    }

    // Controleer of een positie geldig is binnen het speelveld
    private boolean isValidPosition(int newX, int newY) {
        return true;
    }

    // Methode om de spelers huidige positie te krijgen
    public int[] getPositie() {
        return new int[]{x, y};
    }

}