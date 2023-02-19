package overdose.today.athena.util;

public class UtilTimer {

    long lastMS = 0L;

    /**
     * @param ms
     * @return true if the time has reached the given time
     */
    public boolean hasReached(long ms) {
        return System.currentTimeMillis() - this.lastMS >= ms;
    }

    /**
     * resets the timer
     */
    public void reset() {
        this.lastMS = System.currentTimeMillis();
    }

}
