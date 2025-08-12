package Day3;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
    public static void main(String[] args) {
        String input = "abcdef";
        List<String> result = check(input);
        System.out.println(result);
    }

    public static List<String> check(String str) {
        List<String> substrings = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                substrings.add(str.substring(i, j));
            }
        }

        return substrings;
    }
}
