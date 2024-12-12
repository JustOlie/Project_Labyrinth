public class Timer {

    private long elapsedTime;
    private long startTime;
    private long stopTime;


    public void startTimer() {
        startTime = System.currentTimeMillis();
        elapsedTime = 0;
    }

    public void stopTimer() {
        if (startTime != 0) { // DIT IS VOOR ZEKER TE ZIJN DAT DE ELAPSEDTIME STANDAARD 0 IS VOOR JUISTE BEREKENING.
            elapsedTime = System.currentTimeMillis() - startTime;
            startTime = 0; // RESET START TIMER VOOR VOLGENDE SPELER.
        }
    }

    public long getElapsedTime() {
        return elapsedTime;
    }
}
