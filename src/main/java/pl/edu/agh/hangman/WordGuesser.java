package pl.edu.agh.hangman;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordGuesser {

    private int correctCount = 0;
    private String secretWord;
    private String userInput;

    private Set<Character> playerGuesses;

    WordGuesser(String secretWord, String userInput)
    {
        this.secretWord = secretWord;
        this.userInput = userInput;
        this.playerGuesses= new HashSet<>();
    }
    private boolean printLetterOrBlank()
    {
        for(int i = 0; i < secretWord.length(); i++)
        {
            if(playerGuesses.contains(secretWord.charAt(i)))
            {
                System.out.print(secretWord.charAt(i));
                correctCount++;
            }
            else
            {
                System.out.print("_");
            }
        }
        System.out.println();

        return ();
    }

    public void checkWord()
    {
        if(userInput.length() > secretWord.length())
        {
            System.out.println("Don't cheat, homie!");
        }
        else
        {
            for(int i = 0 ; i < userInput.length(); i++)
            {
                playerGuesses.add(userInput.charAt(i));
            }
            printLetterOrBlank();

        }
    }
}
