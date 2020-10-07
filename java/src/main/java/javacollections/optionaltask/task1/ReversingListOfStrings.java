package javacollections.optionaltask.task1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Extract lines from the file and write them to the list. Save the lines to the file in reverse order.
 */
public class ReversingListOfStrings {
    public static void main(String[] args) throws IOException {
        List<String> reversedListOfStrings = Files
                .lines(Paths.get("java/data/listOfStrings.txt"), StandardCharsets.UTF_8)
                .collect(Collectors.collectingAndThen(Collectors.toList(), l -> {
                    Collections.reverse(l);
                    return l.stream();
                }))
                .collect(Collectors.toList());
        Files.write(Paths.get("java/data/reversedListOfStrings.txt"), reversedListOfStrings, Charset.defaultCharset());
    }
}
