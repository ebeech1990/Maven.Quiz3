package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {


    public static Boolean hasVowels(String word) {
        List<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u','y'));
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.size()-1; j++){
                if(word.charAt(i)==vowels.get(j)){
                    return true;
                }
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        List<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u','y'));
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.size()-1; j++){
                if(word.charAt(i)==vowels.get(j)){
                    return i;
                }
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        List<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u','y'));
        word = word.toLowerCase();
        for (int i = 0; i < vowels.size(); i++) {
            if(word.charAt(0)==vowels.get(i)){
                return true;
            }
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        List<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u','y'));
        String s = character.toString().toLowerCase();
        for (int i = 0; i < vowels.size()-1; i++) {{
            if(s.equals(vowels.get(i).toString())){
                return true;
            }
        }

        }
        return false;
    }
}
