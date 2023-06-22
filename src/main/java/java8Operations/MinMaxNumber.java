package java8Operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,222,22,12,23,444,4543);
        System.out.println("list"+ list);

        Integer min = list.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("min"+min);
        Integer max = list.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("max"+max);




    }
}
