package Day2;

import java.util.*;

public class Program1 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "this1 sentence4 a3 is2";
        System.out.println(sortWords(input));
    }
    public static String sortWords(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (String word : words) {
           int position = Character.getNumericValue(word.replaceAll("[^0-9]", "").charAt(0));
         String actualWord = word.replaceAll("[0-9]", "");
            result[position - 1] = actualWord;
        }

        return String.join(" ", result);
    }

    
}
