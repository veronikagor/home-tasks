package javacollections.optionaltask.task3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Add a poem to the list. To sort in ascending order of the lengths of the strings.
 */
public class SortingPoem {
    public static void main(String[] args) throws IOException {
        List<String> reversedLinesFromThePoem = Files
                .lines(Paths.get("java/data/poem.txt"), StandardCharsets.UTF_8)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        Files.write(Paths.get("java/data/sortedPoem.txt"), reversedLinesFromThePoem, Charset.defaultCharset());
    }
}
