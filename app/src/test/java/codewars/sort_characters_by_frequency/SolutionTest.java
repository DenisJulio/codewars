package codewars.sort_characters_by_frequency;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "tree, eert",
            "Aabb, bbaA",
            "cccaaa, aaaccc",
    })
    void testSolution(String input, String expected) throws Exception {
        var solution = new Solution();
        var result = solution.frequencySort(input);
        assertEquals(expected, result);
    }
}