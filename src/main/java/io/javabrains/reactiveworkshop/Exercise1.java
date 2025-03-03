package io.javabrains.reactiveworkshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        numbers.stream().forEach(number-> System.out.println(number));
//
//        // Print all numbers in the intNumbersStream stream
//        // TODO: Write code here
//        StreamSources.intNumbersStream().forEach(num-> System.out.println(num));
//
//        // Print numbers from intNumbersStream that are less than 5
//        // TODO: Write code here
//        StreamSources.intNumbersStream().filter(num -> num.intValue() < 5).forEach(num -> System.out.println(num));

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
//        StreamSources.intNumbersStream().filter(num -> num.intValue() > 5)
//                .skip(1)
//                .limit(2)
//                .forEach(num -> System.out.println(num));

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
//        Integer value = StreamSources.intNumbersStream().filter(num -> num.intValue() > 18)
//                .findFirst()
//                .orElse(-1);
//
//        System.out.println(value);

        // Print first names of all users in userStream
        // TODO: Write code here
//        StreamSources.userStream().forEach(user -> System.out.println(user.getFirstName()));
//        StreamSources.userStream()
//                .map(user -> user.getFirstName())
//                .forEach(firstName -> System.out.println(firstName));

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        StreamSources.intNumbersStream()
                .flatMap(id -> StreamSources.userStream().filter(user -> user.getId()==id))
                        .forEach(value1 -> System.out.println(value1));

        StreamSources.userStream()
                .filter(user -> StreamSources.intNumbersStream().anyMatch(integer -> integer == user.getId()))
                .forEach(System.out::println);

    }

}
