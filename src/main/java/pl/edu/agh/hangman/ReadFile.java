package pl.edu.agh.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    static List<String> words = new ArrayList<>();
    public static List<String> readFile() {
        try {
            File myObj = new File("src/main/resources/slowa.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String word = myReader.nextLine();
                words.add(word.toLowerCase());
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return words;
    }
}
