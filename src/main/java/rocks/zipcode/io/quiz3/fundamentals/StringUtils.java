package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
       List<Character> clist = new ArrayList<>();
       List<String> sList = new ArrayList<>();
       for (char c : string.toCharArray()){
           clist.add(c);
       }

       int numOfCharsToAdd = 1;
        int newLen = clist.size();
        while(numOfCharsToAdd < newLen-1){
            for(int i=0;i<numOfCharsToAdd;i++){
                sList.add(clist.get(i).toString());
                numOfCharsToAdd++;
            }
        }

        for(String s : sList){
            System.out.println(s);
        }
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){
        return null;
    }

    public static void main(String[] args) {
        String input = "Hello";
        StringUtils.getAllSubStrings(input);
    }
}
