package java8Operations;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String[] stringArray = { "Nisha", "Suman", "Amish", "Amisha", "Durgesh", "Esha", "Sarfaraz"};
        /* Method reference to an instance method of an arbitrary
         * object of a particular type
         */
        System.out.println("original" + stringArray);
        System.out.println("***********");
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        System.out.println("original" + stringArray);
        System.out.println("***********");
        for(String str : stringArray){
            System.out.println(str);
          //  System.out.println("***********");
        }
    }
}
