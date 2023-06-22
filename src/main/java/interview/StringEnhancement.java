package interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringEnhancement {
    public static void main(String[] args) {
        String str = "TCS is the largest IT company in the world";
        List<String> list = Arrays.asList(str.split(" "));
        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        //outpt -> {the=2, largest=1, world=1, in=1, TCS=1, company=1, is=1, IT=1}

        List<Integer> integerList = Arrays.asList(2, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 5, 4, 8, 9, 2, 1, 3, 0);
        Set<Integer> integerSet = new HashSet<>();
        integerList.stream().filter(x -> !integerSet.add(x)).forEach(x -> System.out.println(x));
        //integerList.stream().filter(x -> integerSet.add(x)).forEach(x -> System.out.println(x));

    }
}
