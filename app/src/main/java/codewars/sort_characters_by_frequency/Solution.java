package codewars.sort_characters_by_frequency;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public String frequencySort(String s) {
        var charCount = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return charCount.entrySet().stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .map(e -> String.valueOf(e.getKey()).repeat(e.getValue().intValue()))
                .collect(Collectors.joining());
    }
}
