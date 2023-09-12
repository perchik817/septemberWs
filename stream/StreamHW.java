package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamHW {
    public static void main(String[] args){
        /*Все что вам нужно юзать это функциональные интефейсы
            Predicate<T>
            Function<T,R>
            и методы map(), filter
         * Создать лист из String
         * фильтр по словам меньше 3 букв
         * преобрзовать все на uppercase
         *
         * создать лист int, отфильтровать все меньше 45 и больше 34
         * умножить все на 0,6 и округлить до целых с избытком
         * добавить ко всем числам 3
         * вернуть int
         *
         * создать лист из double умножить все числа на 0.7
         * округлить до сотых отфилтровать все числа меньше 23
         * и вернуть стринг
         *
         **/
        //task3
        List<Double> doubles = Arrays.asList(12.34, 15.67, 23.45, 14.56, 5.78);
        String stringDoubles =
                doubles.stream().map(d -> Math.round((d * 0.7 * 100) / 100)).filter(d -> d < 23).map(d -> d.toString()).collect(Collectors.joining(" "));
        System.out.println(stringDoubles);

        //task2
        List<Integer> integers = Arrays.asList(35, 45, 36, 44, 42, 38, 8, 29, 39);
        List<Integer> transformedIntegers =
                integers.stream().filter(i -> i < 45 && i > 34).map(i -> (int) (Math.round(i * 0.6 + 3))).collect(Collectors.toList());
        System.out.println(transformedIntegers);

        //task1
        List<String> strings = Arrays.asList("Work", "with", "streams", "for", "the", "first", "time");
        List<String> transformedStrings =
                strings.stream().filter(s -> s.length() <= 3).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(transformedStrings);
    }
}
