package pl.edu.agh.hangman;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordGuesser {

    private LifePointsCounter lifeScore;
    private String secretWord;
    private Set<Character> playerGuesses;

    WordGuesser()
    {
        this.secretWord = SelectWord.wordSelector();

        this.playerGuesses= new HashSet<>();
        this.lifeScore = new LifePointsCounter();
        System.out.println(lifeScore.lifeScore);
        System.out.println(secretWord);

    }
    public boolean printLetterOrBlank(String userInput)
    {
        int correctCount = 0;
        boolean isCorrectChar = true;
        if (userInput.length() > secretWord.length())
        {
            System.out.println("Don't cheat, homie!");
        }
        else
        {
            for(int i = 0 ; i < userInput.length(); i++)
            {
                playerGuesses.add(userInput.charAt(i));
            }

            for (int i = 0; i < secretWord.length(); i++) {

                if (playerGuesses.contains(secretWord.charAt(i))) {
                    System.out.print(secretWord.charAt(i));
                    correctCount++;
                }
                else
                {
                    isCorrectChar = false;
                    System.out.print("_");
                }
            }
         if(!isCorrectChar)
            {
                lifeScore.changeLifeScore(false);
                isCorrectChar = true;
            }
            System.out.println(lifeScore.lifeScore);
        }

        return (secretWord.length() == correctCount);
    }
}
