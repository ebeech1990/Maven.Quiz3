package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        SomeType value = null;
        for (int i = 0; i < array.length; i++) {
            if(getNumberOfOccurrences(array[i])%2!=0){
                value = array[i];
                break;
            }
        }
        return value;
    }

    public SomeType findEvenOccurringValue() {
          SomeType value = null;
        for (int i = 0; i < array.length; i++) {
            if(getNumberOfOccurrences(array[i])%2==0){
                value = array[i];
                break;
            }
        }
          return value;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {

        return (int) Arrays.stream(this.array)
                .filter(s -> s.equals(valueToEvaluate))
                .count();
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return Arrays.stream(array)
                .filter(s -> predicate.apply(s))
                .toArray(this::genArray);
    }

    public SomeType[] genArray(int size){
        return (SomeType[]) Array.newInstance(this.array.getClass().getComponentType(),size);

    }


}
