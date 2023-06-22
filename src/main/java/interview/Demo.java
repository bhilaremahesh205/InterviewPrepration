package interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        /*Set<String> set = new HashSet<>();
        set.add("Welcome");
        set.add("To");
        set.add("Avizva");
        System.out.println(set.add("Avizva"));
        System.out.println("HashSet: " + set);*/
        //output
        ///false
        //HashSet: [Welcome, Avizva, To]

      /*  List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(2);
        for (Integer integer : integerList) {
            integerList.remove(1);
            System.out.println("Integer " + integer);
        }*/ //output
//        Integer 1
//        Exception in thread "main" java.util.ConcurrentModificationException
//        at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1043)
//        at java.base/java.util.ArrayList$Itr.next(ArrayList.java:997)
//        at interview.Demo.main(Demo.java:24)


        List<String> words =
                new ArrayList(Arrays.asList("cat", "ball", "bat", "cup", "add", "ant"));
        Map<String, List<String>> map = new HashMap();
        for(String word: words){
            String firstChar = String.valueOf(word.charAt(0));
            if (map.get(firstChar) == null){
                map.put(firstChar, new ArrayList(Arrays.asList(word)));
                System.out.println(map);
            }
            else{
                map.get(firstChar).add(word);
                System.out.println(map);
            }

            List<String> list =
                    new ArrayList(Arrays.asList("aa", "ball", "sddd", "ss", "s", "ant"));
            List<String> stringList = list.stream().filter(x->x.length() >2)
                                        .collect(Collectors.toList());
            System.out.println(stringList);

            String strings = list.stream()
                                    .map(x->x.toUpperCase()).collect(Collectors.joining(","));
            System.out.println(strings);

            Stream<String> streamBuilder =
                    Stream.<String>builder().add("a").add("b").add("c").build();
            System.out.println(streamBuilder);

        }
    }
}
