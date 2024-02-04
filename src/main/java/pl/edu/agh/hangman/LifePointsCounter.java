package pl.edu.agh.hangman;

public class LifePointsCounter {

    public int lifeScore = 7;

    public boolean changeLifeScore(boolean isCorrect) {

        if(!isCorrect) {
            this.lifeScore -= 1;
            return isEndgame();
        }
        return true;
    }

    public boolean isEndgame() {
        return this.lifeScore == 0;
    }
}
