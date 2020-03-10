package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {

        List<String> list = new ArrayList<>();
        String[] words = str.split(" ");
        list.addAll(Arrays.asList(words));
        List<String> newList = new ArrayList<>();
        String temp = "";
        for(String s : list){
            StringBuilder sb = new StringBuilder(s);
            if(VowelUtils.startsWithVowel(s)){
               temp = sb.append("way").toString();
               newList.add(temp);
            }
            else{
                int i = 0;
                for (Character c : s.toCharArray()){

                    if(!VowelUtils.isVowel(c)){
                        sb.append(c);
                        sb.delete(0,1);
                        i++;
                        if(i==s.length()-1){
                            temp = sb.append("ay").toString();
                            newList.add(temp);
                            break;
                        }
                    }
                    else {
                        temp = sb.append("ay").toString();
                        newList.add(temp);
                        break;
                    }
                }
            }




            sb.setLength(0);
        }
        String result = String.join(" ", newList);
        return result;
    }



}