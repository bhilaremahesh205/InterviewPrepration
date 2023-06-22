package model;

import org.springframework.data.mongodb.core.query.Collation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinValue {
    public static void main(String[] args) {

        Integer[] integer= {11,44,66,77,3,2,1,99};
        List<Integer> integerList = Arrays.asList(integer);

        List<Integer> min = integerList.stream().sorted().collect(Collectors.toList());
        System.out.println("minimum value is:"+"\t"+ min.get(0));
       // System.out.println("minimum value is:"+"\t"+ min.get(0)-1);

        System.out.println("************************");

        List<Integer> integerList1 = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(2);

        for (Integer integers : integerList1) {
            integerList.remove(1);
            System.out.println("Integer " + integers);
        }

        System.out.println("Integer List - " + integerList1);

    }
}
