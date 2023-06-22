package BasicsOperations;

import org.springframework.data.mongodb.core.aggregation.StringOperators;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Arithmetics {
    public static void main(String[] args) {
        //Given a list of integers, find out all the even numbers exist in the list using Stream functions?

        List<Integer> list = Arrays.asList(2,3,4,5,6,7,1,22,33,44,55,66,7);
        //List<Integer> even =list.stream().filter(no->no%2==0).collect(Collectors.toList());
        //System.out.println(even+"even");
        list.stream().filter(no->no%2==0).forEach(System.out::println);
        //Given a list of integers, find out all the numbers starting with 1 using Stream functions?

        System.out.println("-------------------"+"number starts with 1"+"-------------------");
        List<Integer> intList = Arrays.asList(1,11,13,44,55,66,77,15,166);
        intList.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);

        //How to find duplicate elements in a given integers list in java using Stream functions?

        System.out.println("-------------------"+"duplicate elements from list"+"-------------------");
        List<Integer> intListData = Arrays.asList(11,11,22,33,44,44,55,55,66,66,5,3,2,7,8,9);
        Set<Integer> integerSet = new HashSet<>();
        intListData.stream().filter(no -> !integerSet.add(no)).forEach(System.out::println);


        //Given the list of integers, find the first element of the list using Stream functions?
        System.out.println("-------------------"+"first elements from list"+"-------------------");
        List<Integer> integers = Arrays.asList(33,44,11,333,44,5,5555,5,33,44,44);
        integers.stream().findFirst().stream().forEach(System.out::println);

//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        myList.stream()
//                .findFirst()
//                .ifPresent(System.out::println);


        //Given a list of integers, find the total number of elements present in the list using Stream functions?
        System.out.println("-------------------"+"count elements from list"+"-------------------");
        List<Integer> list1 = Arrays.asList(11,2,3,4,5,6,7,22,3,44,33,222,111,45);
        long no = list1.stream().count();
        System.out.println(no+ "count");

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        // Given a list of integers, find the maximum value element present in it using Stream functions?
        System.out.println("-------------------"+"min-max elements from list"+"-------------------");
        List<Integer> integers1 = Arrays.asList(1,2,3,44,555,6666,33,222,23,56,78,34,54);
        int max = integers1.stream().max(Integer::compare).get();
        int min = integers1.stream().min(Integer::compare).get();
        System.out.println(max + "max number");
        System.out.println(min + "min number");

        // Given a String, find the first non-repeated character in it using Stream functions?
        System.out.println("-------------------"+"non repeated character from list"+"-------------------");
        String input = "Java Hungry Blog Alive is Awesome";


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        Character result = input.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);
        System.out.println("-------------------"+"repeated character from list"+"-------------------");


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        String input1 = "Java Hungry Blog Alive is Awesome";
        Character result1 = input1.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result1);


        for(int i=1;i<=100;i++){
            System.out.println(" numbers are" + i);
        }


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        String str[] = {"mahabaleshwar","satara","pune","goa","delhi"};
        Optional<String> strdata = Arrays.stream(str).reduce((word1, word2) -> word1.length() > word2.length() ? word1:word2);
        System.out.println("large string is" + strdata);


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        int numbers[] = {5,9,11,4,2,12,16,22,33,7,1};
        int highestNumber = Arrays.stream(numbers).
                boxed().skip(2).findFirst().get();
        System.out.println(highestNumber+"highest number");


        List<String> stringList = Arrays.stream(numbers)
                                    .boxed().map(s->s+"")
                                    .filter(s -> s.startsWith("1")).collect(Collectors.toList());
        System.out.println(stringList+ "starts number with 1");

        String strData = "i love mahabaleshwar";
        Map<String, Long > stringStringMap = Arrays.asList(strData.split(""))
                .stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stringStringMap + "");

        //{a=4, r=1, b=1, s=1, e=2, v=1, w=1, h=2, i=1, l=2, m=1, o=1}


        System.out.println("count max occurences");
        String strInfo = "ilovemahabaleshwar";
        List<String> data = Arrays.asList(strInfo.split(""))
                .stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(data + "");

        System.out.println("count unique occurences");
        String stringValue = "ilovemahabaleshwar";
        List<String> info = Arrays.asList(stringValue.split(""))
                .stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(info + "");



        System.out.println("first non repeat element occurences");
        String value = "ilovemahabaleshwar";
        String dataValue = Arrays.asList(value.split(""))
                .stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println(dataValue + "");


        int numberss[] = {2,1,33,3,21,333,44,34};
        List<Integer> intData = Collections.singletonList(Arrays.stream(numberss).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get());
                //.collect(Collectors.toList());
        System.out.println(intData+"");



        ///////////////////////
        /*        key - First char of the name you are iterating
        value - Last name that starts with the key
        */
//        List<String> name =  Arrays.asList("Aman", "Ajay", "Vivek", "Hari", "Mohan", "Vijay", "Ashish", "Mohit", "Zeeshan", "Ravi");
//        return Hashmap<Character, String>
//
//        HashMap<String, String> numbers = new HashMap<>();
//        numbers.put("Uno", "One");
//        numbers.put("Dos", "Zwei");
//        numbers.put("Uno", "Ein");
//
//        String translation = numbers.get("Uno");
//        System.out.println(translation);
//
//        System.out.println(numbers.get("Dos"));
//        System.out.println(numbers.get("Tres"));
//        System.out.println(numbers.get("Uno")


        String strng = "mahabaleshwar";
        char[] ch = strng.toCharArray();
        for (char c : ch){
            System.out.println(c + " --->" +"character");
        }

        char[] chr = {'m','a','h','a','b','a','l','e','s','h','w','a','r'};
        String st = new String(chr);
            System.out.println(st + "--->" + "String" );
    }

}



