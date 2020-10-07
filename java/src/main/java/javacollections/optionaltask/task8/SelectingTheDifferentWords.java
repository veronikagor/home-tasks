package javacollections.optionaltask.task8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * There is a file with English text. Select all the different words.
 * Words that differ only in letters are considered the same. Use the class HashSet.
 */
public class SelectingTheDifferentWords {
    public static void main(String[] args) throws IOException {
        HashSet<String> hashSet = new HashSet<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("java/data/words.txt"));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                hashSet = Stream.of(line.split("[^A-Za-z]+"))
                        .map(String::toLowerCase)
                        .collect(Collectors.toCollection(HashSet::new));
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("File error: " + e);
        }

        Files.write(Paths.get("java/data/sortedWords.txt"), hashSet, Charset.defaultCharset());
    }
}
