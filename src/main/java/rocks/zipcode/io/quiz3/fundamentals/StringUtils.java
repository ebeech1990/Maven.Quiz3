package rocks.zipcode.io.quiz3.fundamentals;

import java.util.*;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] arr = str.toCharArray();
        arr[indexToCapitalize] = Character.toUpperCase(arr[indexToCapitalize]);
        String s = new String(arr);

        return s;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if(baseString.charAt(indexOfString)==characterToCheckFor){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> list = new LinkedHashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length()+1; j++) {
                list.add(string.substring(i,j));
            }
        }
        String[] result = list.stream().toArray(String[]::new);
        return result;
    }

    public static Integer getNumberOfSubStrings(String input){

        List<String> list = Arrays.asList(getAllSubStrings(input));
        int count = list.size();
        return count;
    }


}
