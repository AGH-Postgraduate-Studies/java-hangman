package pl.edu.agh.hangman;
import java.util.List;
import java.util.Random;

import pl.edu.agh.hangman.ReadFile;

public class SelectWord {
    public static String wordSelector() {
        List<String> words = ReadFile.readFile();

        String selectedWord = words.get(new Random().nextInt(words.size()));

        return selectedWord;
    };
}
