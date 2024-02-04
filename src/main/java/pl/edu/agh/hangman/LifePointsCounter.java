package pl.edu.agh.hangman;

public class LifePointsCounter {

    public int lifeScore = 3;

    public boolean changeLifeScore(boolean isCorrect) {

        if(!isCorrect) {
            lifeScore -= 1;
            return isEndgame();
        }
        return true;
    }

    private boolean isEndgame() {
        return lifeScore == 0;
    }
}
