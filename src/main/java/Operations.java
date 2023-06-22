import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Operations {
    public static void main(String[] args) throws IOException {

        //Q) Create a List and Filter all even numbers from List
        List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67);
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);
        List<Integer> list3 = Arrays.asList(23, 567, 12, 677, 24);

//list1
//without stream
        List<Integer> listEven = new ArrayList<>();
        for (Integer i : list1) {
            if (i % 2 == 0) {
                listEven.add(i);
            }
        }

        System.out.println(list1);
        System.out.println(listEven);

        Map<Integer, String> map = Map.of(1, "mahesh", 2, "srujan", 3, "sunny", 4, "shubham");
        map.entrySet().forEach(e -> System.out.println(e));

        var message = "the power of Java 10! applies to Java 11, too";
        var daysInMonth = 30;

        System.out.println("Java 10+: " + message);
        System.out.println("Java 10+: " + daysInMonth);

        Path path = Files.writeString(Files.createTempFile("sample", ".txt"), "Look ma! I'm a writer!");

        //Reading contents from sample.txt
        System.out.println(Files.readString(path));
    }
}
