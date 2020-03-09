package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        StringBuilder sb = new StringBuilder(str);
        List<String> list = new ArrayList<>();
        String[] words = str.split(" ");
        list.addAll(Arrays.asList(words));
        List<String> newList = new ArrayList<>();
            for(String s : list){
                if(VowelUtils.isVowel(s.charAt(0))){
                    newList.add(sb.append("way").toString());
                }
                else if(!VowelUtils.isVowel(s.charAt(0))){
                    for(Character c : s.toCharArray()){
                        if(!VowelUtils.isVowel(c)){
                            sb.append(c);
                        }
                        else{
                            newList.add(sb.append("ay").toString());
                        }
                    }
                }
            }
        String result = String.join(" ", newList);



        return result;
    }
}
