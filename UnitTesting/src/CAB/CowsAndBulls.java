package CAB;
public class CowsAndBulls {
    private final int[] toGuess;
    private String state;
    private int bulls;
    private int cows;
    private int guessCounter;
    public CowsAndBulls(int[] toGuess) {
        this.toGuess = toGuess;
        this.state = "playing";
        this.guessCounter = 0;
    }

    public String guess(int[] guess) {
        bulls = 0;
        cows = 0;
        int[] guessArray  = {-1, -1, -1, -1};
        String guessString;
        String[] guessStringArray;
        guessString = guess[0] + "" + guess[1] + guess[2]+ guess[3];
        guessStringArray = guessString.split("");
        for (int i = 0; i < 4; i++) {
            guessArray[i] = Integer.parseInt(guessStringArray[i]);
        }
        guessCounter++;
        for (int i = 0; i < 4; i++) {
            if (guessArray[i] == this.toGuess[i]) {
                cows++;
            } else {
                for (int j = 0; j < 4; j++) {
                    if (this.toGuess[i] == guessArray[j]) {
                        bulls++;
                    }
                }
            }
        }
        if (this.cows == 4) {
            this.state = "finished";
            return "4 Cows and 0 Bulls";
        } else {
            return cows + " Cows and " + bulls + " Bulls";
        }
    }

    public String getState() {
        return state;
    }

    public int getBulls() {
        return bulls;
    }

    public int getCows() {
        return cows;
    }

    public int[] getToGuess() {
        return toGuess;
    }

    public int getGuessCounter() {
        return guessCounter;
    }
}
