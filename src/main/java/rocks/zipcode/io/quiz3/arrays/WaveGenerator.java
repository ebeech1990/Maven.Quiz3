package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        List<String> list = new ArrayList<>();
        str = str.toLowerCase();
        String s = "";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if(isLetter(str.charAt(i))){
                s = StringUtils.capitalizeNthCharacter(str,i);
                list.add(s);
            }

        }

        String[] result = new String[list.size()];
        System.arraycopy(list.toArray(),0,result,0,list.size());
        return result;
    }

    public static boolean isLetter(Character c){

            if (Character.isAlphabetic(c)) {
                return true;
            }

        return false;
    }
}
